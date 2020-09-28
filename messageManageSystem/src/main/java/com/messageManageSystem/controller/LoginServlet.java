package com.messageManageSystem.controller;

import com.messageManageSystem.entity.Message;
import com.messageManageSystem.entity.User;
import com.messageManageSystem.service.MessageService;
import com.messageManageSystem.service.UserService;
import com.messageManageSystem.service.impl.MessageServiceImpl;
import com.messageManageSystem.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserService userService = new UserServiceImpl();
        MessageService messageService = new MessageServiceImpl();
        //请求编码格式
        req.setCharacterEncoding("utf-8");
        //设置响应编码格式
        resp.setContentType("text/html;charset=utf-8");
        //登录验证
        System.out.println("登录");
        String loginname = req.getParameter("loginname");
        String password = req.getParameter("password");
        System.out.println(loginname);
        if (loginname == "") {
            req.setAttribute("message", "请输入账号!");
            req.getRequestDispatcher("pages/user/login.jsp").forward(req, resp);
        }
        System.out.println(password);
        User user = userService.queryByLoginname(loginname);
        System.out.println(user);
        if (user == null) {
            System.out.println("不存在");
            req.setAttribute("message", "账号不存在!");
            req.getRequestDispatcher("pages/user/login.jsp").forward(req, resp);
        } else {
            req.setAttribute("loginname", loginname);
            if (password.equals(user.getLoginpwd())) {
                //登录成功
                List<Message> messages = messageService.showMessage(loginname);
                req.setAttribute("messages", messages);
                req.getRequestDispatcher("pages/user/loginsuccess.jsp").forward(req, resp);
                System.out.println();
            } else {
                //密码错误
                req.setAttribute("message", "密码错误!");
                req.getRequestDispatcher("pages/user/login.jsp").forward(req, resp);
            }
        }
    }
}
