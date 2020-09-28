<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/09/17
  Time: 11:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%String message = (String) request.getAttribute("message");%>
<html>
<head>
    <title>会员管理系统</title>
</head>
<body>
<table align="center" border="1px solid blue">
    <form method="post" action="Servlet">
        <tr align="center">
            <td><h3>用户登录</h3></td>
        </tr>
        <tr align="center">
            <td>账号：<input name="loginname" type="text"/></td>
        </tr>
        <tr align="center">
            <td>密码：<input name="pwd" type="password"/></td>
        </tr>
        <tr align="center">
            <td><input type="submit" value="登录"/></td>
        </tr>
        <tr align="center"><%if (message != null) {%>
            <td align="center">
                <h3 align="center">
                    <%=message%>
                </h3>
                <%}%>
            </td>
        </tr>
    </form>
</table>
</body>
</html>
