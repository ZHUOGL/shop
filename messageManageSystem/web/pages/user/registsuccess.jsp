<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/09/26
  Time: 19:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <title>注册成功</title>
    <base href="<%=basePath%>>">
</head>
<body>
<div style="text-align: center;margin: 0 auto;width: 300px">
    <h1>注册成功</h1>
    <a href="login.jsp">返回登录</a>
</div>

</body>
</html>
