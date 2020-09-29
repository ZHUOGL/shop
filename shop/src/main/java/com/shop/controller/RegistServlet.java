package com.shop.controller;

import com.google.gson.Gson;
import com.shop.bean.User;
import com.shop.dao.UserDao;
import com.shop.dao.impl.UserDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY;

public class RegistServlet extends HttpServlet {
    UserDao userDao = new UserDaoImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("action");
        boolean flag = userDao.loginnameExist(username);
        if (flag) {
            String message = "用户名已存在";
            Gson gson = new Gson();
            String jsonStr = gson.toJson(message);
            resp.setContentType("text/html;charset=utf-8");
            resp.getWriter().write(jsonStr);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String email = req.getParameter("email");
        String code = req.getParameter("code");
        String token = (String) req.getSession().getAttribute(KAPTCHA_SESSION_KEY);
        if (code.equalsIgnoreCase(token)) {
            if (userDao.loginnameExist(username)) {
                req.setAttribute("info", "账号已经存在！");
                req.getSession().removeAttribute(KAPTCHA_SESSION_KEY);
                req.getRequestDispatcher("pages/user/regist.jsp").forward(req, resp);
            } else {
                //注册
                int result = userDao.saveUser(new User(username, password, email));
                if (result > 0) {
                    req.getRequestDispatcher("/pages/user/regist_success.html").forward(req, resp);
                } else {
                    req.setAttribute("info", "注册失败！");
                    req.getSession().removeAttribute(KAPTCHA_SESSION_KEY);
                    req.getRequestDispatcher("pages/user/regist.jsp").forward(req, resp);
                }
            }
        } else {
            req.setAttribute("info", "验证码错误！");
            req.getSession().removeAttribute(KAPTCHA_SESSION_KEY);
            req.getRequestDispatcher("pages/user/regist.jsp").forward(req, resp);
        }
    }
}
