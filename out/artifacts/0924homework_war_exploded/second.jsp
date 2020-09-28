<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<%
    String username = request.getParameter("username");
    String password = request.getParameter("password");

    if (username.equals("admin") && password.equals("123456")) {
        //将登陆成功的用户保存在request中
        request.setAttribute("uname", username);
        //将登陆成功的用户保存在session中
        // session.setAttribute("uname",uname);
        //请求转发
        request.getRequestDispatcher("third.jsp").forward(request, response);
    } else {
        //重定向
        request.setAttribute("message", "用户名或密码错误，请重新输入!");
        request.setAttribute("uname", username);
        request.getRequestDispatcher("first.jsp").forward(request, response);
    }

%>
