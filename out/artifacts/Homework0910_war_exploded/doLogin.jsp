
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
   String uname= request.getParameter("userid");
   String upass= request.getParameter("passwd");

   if(uname.equals("admin") && upass.equals("123")){
       //将登陆成功的用户保存在request中
       //request.setAttribute("uname",uname);
       //将登陆成功的用户保存在session中
       session.setAttribute("uname",uname);
      //请求转发
       request.getRequestDispatcher("success.jsp").forward(request,response);
   }
   else{
       //重定向
       response.sendRedirect("mailLogin.jsp");
   }

%>
