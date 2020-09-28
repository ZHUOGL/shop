package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //注册验证
        //正则表达式验证
//        boolean flag;
//        String regex = "^[a-zA-Z]\\w{5,17}$";
//        String reName=request.getParameter("username");
//        flag = username.matches(regex);
        //登录验证
        String username = request.getParameter("username");
        String pwd = request.getParameter("password");
        //request.setAttribute("loginName", username);
        System.out.println(username);
        System.out.println(pwd);

        if (username.equals("admin") && pwd.equals("123")) {
            request.getRequestDispatcher("/pages/user/login_success.jsp").forward(request, response);
            // response.sendRedirect("/pages/user/login_success.html");
        } else {
            request.setAttribute("message", "账号或者密码错误！");
            request.getRequestDispatcher("/pages/user/login.jsp").forward(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
