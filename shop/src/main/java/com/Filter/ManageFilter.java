package com.Filter;

import com.shop.dao.UserDao;
import com.shop.dao.impl.UserDaoImpl;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class ManageFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("过滤器初始化");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        UserDao userDao = new UserDaoImpl();
        String username = servletRequest.getParameter("username");
        String pwd = servletRequest.getParameter("password");
        filterChain.doFilter(servletRequest, servletResponse);

//        if (username == null || username.isEmpty()) {
//            System.out.println("没有权限,返回登录页");
//            httpServletRequest.getRequestDispatcher("/pages/user/login.jsp").forward(servletRequest, servletResponse);
//        }
//        if (userDao.login(username, pwd)) {
//            filterChain.doFilter(servletRequest, servletResponse);
//        } else {
//            httpServletRequest.getRequestDispatcher("/pages/user/login.jsp").forward(servletRequest, servletResponse);
//        }
    }

    @Override
    public void destroy() {

    }
}
