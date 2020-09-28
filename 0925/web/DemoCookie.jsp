<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/09/25
  Time: 10:15
  To change this template use File | Settings | File Templates.
--%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cookie学习</title>
</head>
<body>
<form action="ServletCookie" method="post">
    <table border="1px" align="center" style="text-align: center">
        <tr>
            <td>账号：</td>
            <td><input type="text" name="username" value="${cookie.username.value}"></td>
        </tr>
        <tr>
            <td>密码：</td>
            <td><input type="password" name="password"></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" name="登录"></td>
        </tr>
    </table>

</form>
</body>
</html>
