<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/09/24
  Time: 18:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<c:set scope="session" var="message" value=""/>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form class="form" NAME="myform" METHOD="POST" action="second.jsp">
    <table width="300px" align="center" border="1px">
        <tr>
            <td>用户名:</td>
            <td><input type="text" name="username" value="${uname}"></td>
        </tr>
        <tr>
            <td>密码:</td>
            <td><input type="password" name="password"></td>
        </tr>
        <tr align="center">
            <td colspan="2"><a href="#"><input type="submit" value="登录"/></a></td>
        </tr>
        <tr>
            <td colspan="2">${message}</td>
        </tr>
    </table>
</form>
</body>
</html>
