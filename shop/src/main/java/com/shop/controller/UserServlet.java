package com.shop.controller;

import com.google.gson.Gson;
import com.shop.bean.User;
import com.shop.service.Impl.UserServiceImpl;
import com.shop.service.UserService;
import com.shop.utils.WebUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

import static com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY;


public class UserServlet extends BaseServlet {
    private UserService userService = new UserServiceImpl();

    protected void login(HttpServletRequest req, HttpServletResponse resp) throws ServletException,
            IOException {
        //登录
        Map<String, String[]> parameterMap = req.getParameterMap();
        User user = new User();
        WebUtils.copyParamToBean(user, parameterMap);
        System.out.println(user);
        String code = req.getParameter("code");
        String token = (String) req.getSession().getAttribute(KAPTCHA_SESSION_KEY);
        System.out.println("token=" + token);
        System.out.println("code=" + code);
        // 删除 Session 中的验证码
        req.getSession().removeAttribute(KAPTCHA_SESSION_KEY);
        if (!code.equalsIgnoreCase(token)) {
            req.setAttribute("message", "验证码输入错误！");
            req.setAttribute("username", user.getUsername());
            req.getRequestDispatcher("/pages/user/login.jsp").forward(req, resp);
        } else {
            //验证码正确
            System.out.println();
            System.out.println(user);
            User loginUser = userService.login(user);
            System.out.println("loginUser=" + loginUser);
            if (loginUser == null) {
                req.setAttribute("message", "密码错误！");
                req.setAttribute("username", user.getUsername());
                req.getRequestDispatcher("/pages/user/login.jsp").forward(req, resp);
            } else {
                // 登录成功
                System.out.println("登录成功");
                req.getRequestDispatcher("/pages/user/login_success.jsp").forward(req, resp);
            }
        }
    }

    protected void loginHelp(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        //信息提示
        String loginname = req.getParameter("loginname");
        Gson gson = new Gson();
        if (userService.loginnameExist(loginname)) {
            String helpInfo = "用户名可用";
            String jsonStr = gson.toJson(helpInfo);
            resp.setContentType("text/html;charset=utf-8");
            resp.getWriter().write(jsonStr);
        } else if (loginname != null && !loginname.isEmpty()) {
            String helpInfo = "用户名不存在！";
            String jsonStr = gson.toJson(helpInfo);
            resp.setContentType("text/html;charset=utf-8");
            resp.getWriter().write(jsonStr);
        }
    }

    protected void registHelp(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        //System.out.println("测试registHelp");
        //信息提示
        String loginname = req.getParameter("username");
        Gson gson = new Gson();
        System.out.println("loginname=" + loginname);
        if (userService.loginnameExist(loginname)) {
            String helpInfo = "用户名已存在";
            String jsonStr = gson.toJson(helpInfo);
            resp.setContentType("text/html;charset=utf-8");
            System.out.println(jsonStr);
            resp.getWriter().write(jsonStr);
        }
//        else if (loginname != null && !loginname.isEmpty()) {
//            String helpInfo = "用户名可用";
//            String jsonStr = gson.toJson(helpInfo);
//            resp.setContentType("text/html;charset=utf-8");
//            System.out.println(jsonStr);
//            resp.getWriter().write(jsonStr);
//        }
    }

    protected void regist(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String code = req.getParameter("code");
        String token = (String) req.getSession().getAttribute(KAPTCHA_SESSION_KEY);
        System.out.println("token=" + token);
        System.out.println("code=" + code);
        // 删除 Session 中的验证码
        req.getSession().removeAttribute(KAPTCHA_SESSION_KEY);
        if (!code.equalsIgnoreCase(token)) {
            req.setAttribute("info", "验证码输入错误！");
            req.setAttribute("username", req.getParameter("username"));
            req.getRequestDispatcher("/pages/user/regist.jsp").forward(req, resp);
        } else {
            //验证码正确
            Map<String, String[]> parameterMap = req.getParameterMap();
            User user = new User();
            WebUtils.copyParamToBean(user, parameterMap);
            System.out.println(user);
            int result = userService.saveUser(user);
            if (result > 0) {
                req.getRequestDispatcher("/pages/user/regist_success.jsp").forward(req, resp);
            } else {
                req.setAttribute("info", "注册失败！");
                req.setAttribute("username", user.getUsername());
                req.getRequestDispatcher("/pages/user/regist.jsp").forward(req, resp);
            }
        }
    }
}

