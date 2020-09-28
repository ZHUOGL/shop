package com.shop.controller;

import com.shop.dao.UserDao;
import com.shop.dao.impl.UserDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class OrderServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserDao userDao = new UserDaoImpl();
        HttpSession httpSession = req.getSession();
        String loginname = (String) httpSession.getAttribute("loginname");
        String password = (String) httpSession.getAttribute("password");
        if (loginname == null || password == null || !userDao.login(loginname, password)) {
            resp.getWriter().write("会话超时请重新登录！");
            resp.sendRedirect(req.getContextPath()+"/pages/user/login.jsp");
        }else {
            //逻辑判断

        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
