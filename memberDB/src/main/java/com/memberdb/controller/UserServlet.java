package com.memberdb.controller;

import com.memberdb.entity.User;
import com.memberdb.service.UserService;
import com.memberdb.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class UserServlet extends HttpServlet {
    UserService userService = new UserServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String page = request.getParameter("page");
        Long maxPage = userService.getMaxPage(5);
        int pageNum = 1;
        if (page != null) {
            pageNum = Integer.valueOf(page.trim());
        }
        List<User> userList = userService.queryUserListByPage(pageNum, 5);
        request.setAttribute("users", userList);
        request.setAttribute("maxPage", maxPage);
        request.getRequestDispatcher("/userList.jsp").forward(request, response);
    }
}
