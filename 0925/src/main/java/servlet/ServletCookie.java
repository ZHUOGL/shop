package servlet;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ServletCookie extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        createCookie(req, resp);
    }

    public void createCookie(HttpServletRequest req, HttpServletResponse resp) {
        resp.setContentType("text/html;charset=UTF-8");
        String uname = (String) req.getParameter("username");
        System.out.println(uname);
//        Cookie cookie1 = new Cookie("cookie1", "我是cookie1");
//        Cookie cookie2 = new Cookie("cookie2", "我是cookie2");
//        resp.addCookie(cookie1);
//        resp.addCookie(cookie2);
        Cookie username = new Cookie("username", uname);
        resp.addCookie(username);
    }

    public void getCookie(HttpServletRequest req, HttpServletResponse resp) {

    }
}
