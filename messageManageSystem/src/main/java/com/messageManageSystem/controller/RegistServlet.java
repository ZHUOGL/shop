package com.messageManageSystem.controller;

import com.messageManageSystem.entity.User;
import com.messageManageSystem.service.UserService;
import com.messageManageSystem.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RegistServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //请求编码格式
        req.setCharacterEncoding("utf-8");
        //设置响应编码格式
        resp.setContentType("text/html;charset=utf-8");
        //登录验证
        System.out.println("注册1");
        resp.sendRedirect("pages/user/regist.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //请求编码格式
        req.setCharacterEncoding("utf-8");
        //设置响应编码格式
        resp.setContentType("text/html;charset=utf-8");
        //登录验证
        UserService userService = new UserServiceImpl();
        String loginname = req.getParameter("loginname");
        String password = req.getParameter("password");
        String password2 = req.getParameter("password2");
        String email = req.getParameter("email");
        System.out.println(loginname + password + password2 + email);
        User user1 = userService.queryByLoginname(loginname);
        System.out.println("user1=" + user1);
        if (user1 != null) {
            req.setAttribute("message", "用户名已存在！");
            req.getRequestDispatcher("pages/user/regist.jsp").forward(req, resp);
        } else {
            if (password.equals(password2)) {
                User user = new User(loginname, password, 0, email);
                System.out.println(user);
                int result = userService.addUser(user);
                if (result > 0) {
                    req.getRequestDispatcher("pages/user/registsuccess.jsp").forward(req, resp);
                }

            } else {
                System.out.println("一致？");
                req.setAttribute("message", "两次输入的密码不一致！");
                req.getRequestDispatcher("pages/user/regist.jsp").forward(req, resp);
            }

        }
    }
}
