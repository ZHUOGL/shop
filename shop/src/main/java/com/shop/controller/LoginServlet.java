package com.shop.controller;

import com.google.gson.Gson;
import com.shop.bean.User;
import com.shop.dao.UserDao;
import com.shop.dao.impl.UserDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    UserDao userDao = new UserDaoImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserDao userDao = new UserDaoImpl();
        String username = request.getParameter("username");
        String pwd = request.getParameter("password");
        System.out.println(username);
        System.out.println(pwd);
        //账号存在的话
        if (userDao.loginnameExist(username)) {
            //登录成功的话
            if (userDao.login(username, pwd)) {
                HttpSession httpSession = request.getSession();
                //session中储存账号密码 session过期的话为空验证失败
                httpSession.setAttribute("username", username);
                httpSession.setAttribute("password", pwd);
                request.getRequestDispatcher("/pages/user/login_success.jsp").forward(request, response);
            }
            //登录失败
            else {
                request.setAttribute("message", "账号或者密码错误！");
                request.getRequestDispatcher("/pages/user/login.jsp").forward(request, response);
            }
        } else {
            request.setAttribute("message", "账号不存在！");
            request.getRequestDispatcher("/pages/user/login.jsp").forward(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String loginname = request.getParameter("action");
        System.out.println(loginname);
        Gson gson = new Gson();
        System.out.println(userDao.loginnameExist(loginname));
        if (userDao.loginnameExist(loginname)) {
            String message = "用户名可用";
            String jsonStr = gson.toJson(message);
            System.out.println(jsonStr);
            response.setContentType("text/html;charset=utf-8");
            response.getWriter().write(jsonStr);
        } else {
            String message = "用户名不存在！";
            System.out.println(message);
            String jsonStr = gson.toJson(message);
            response.setContentType("text/html;charset=utf-8");
            response.getWriter().write(jsonStr);
        }
    }

    public void logout(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.getSession().invalidate();
        response.sendRedirect(request.getContextPath());
    }
}
