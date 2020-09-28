package com.ebank.controller;

import com.ebank.entity.Phone;
import com.ebank.service.PhoneService;
import com.ebank.service.impl.PhoneServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "SearchServlet")
public class SearchServlet extends HttpServlet {
    PhoneService phoneService = new PhoneServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String info = request.getParameter("pay");
        System.out.println("info=" + info);

        if (info == null) {
            String phoneNumber = request.getParameter("phoneNumber");
            System.out.println(phoneNumber);
            Phone phone = phoneService.queryByPhone(phoneNumber);
            System.out.println(phone);
            if (phone != null) {
                //存储phone
                request.getServletContext().setAttribute("phone", phone);
                if (phone.getStatus() == 1) {
                    request.getRequestDispatcher("phonePaid.jsp").forward(request, response);
                } else if (phone.getStatus() == 0) {
                    request.getRequestDispatcher("phoneNotPaid.jsp").forward(request, response);
                }
                request.setAttribute("message", null);

            } else {
                //System.out.println("不存在");
                request.setAttribute("message", "办理的业务号码不存在，请重新输入。");
                request.getRequestDispatcher("search.jsp").forward(request, response);
                // response.sendRedirect("search.jsp");
            }
        } else {

            Phone phone = (Phone) request.getServletContext().getAttribute("phone");
            System.out.println(phone);
            int result = phoneService.update(phone);
            if (result < 0) {
                response.sendRedirect("failed.jsp");
            } else {
                response.sendRedirect("success.html");
                // request.getRequestDispatcher("success.html").forward(request, response);
            }
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
