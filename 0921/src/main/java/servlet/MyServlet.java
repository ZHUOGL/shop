package servlet;

import javax.servlet.ServletException;
import java.io.IOException;

@javax.servlet.annotation.WebServlet(name = "MyServlet")
public class MyServlet extends javax.servlet.http.HttpServlet {
    @Override
    public void init() throws ServletException {
        //初始化一个变量count的值为0
        int count = 0;
        //将这个值存入到ServletContext中
        this.getServletContext().setAttribute("count", count);
        super.init();
    }

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        System.out.println("Post请求");
        response.setContentType("text/html;charset=UTF-8");
        //1.接收表单提交的参数
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        //2.封装到实体对象中
//        User user = new User();
//        user.setPassword(password);
//        user.setUsername(username);
        if (username.equals("admin") && password.equals("123")) {
            //登录成功
            //记录次数
            int count = (int) this.getServletContext().getAttribute("count");
            count++;
            this.getServletContext().setAttribute("count", count);
            response.getWriter().println("<h1>登录成功：您是第" + count + "位登录成功的用户</h1>");
        } else {
            //登录失败
            response.getWriter().println("<h1>登录失败,用户名或密码错误</h1>");
        }
    }



    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        System.out.println("Get请求");
    }
}
