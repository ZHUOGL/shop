<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/7/24/024
  Time: 15:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录成功</title>
</head>
<body>
<tr>
    <td>
        <h1 align="center">你好：<%out.print(request.getAttribute("uname"));%>!</h1>
    </td>
</tr>
</body>
</html>
