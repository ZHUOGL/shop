<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/09/25
  Time: 19:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<script type="text/javascript" src="jquery-1.7.2.js"></script>--%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<script>
    function clear() {
        $("input").each(function () {
            this.val("");
        });
    }
</script>
<html>
<head>
    <title>注册</title>
    <base href="<%=basePath%>>">
</head>
<body>
<div style="margin: 0 auto;width: 400px;background: #5bc0de;text-align: center">
    <form action="RegistServlet" method="post">
        <h1>注册信息</h1>
        <tr>${message}</tr>
        <tr>用户名：<input type="text" name="loginname"></tr>
        <br>
        <br>
        <tr>密码：<input type="password" name="password"></tr>
        <br><br>
        <tr>确认密码：<input type="password" name="password2"></tr>
        <br><br>
        <tr>邮箱：<input type="text" name="email"></tr>
        <br><br>
        <tr>
            <td>
                <input type="submit" value="注册">
                <input type="button" value="清空">
            </td>
        </tr>
        <br>
        <br>
    </form>
    <tr>
        <td><a href="pages/user/login.jsp">返回首页</a></td>
    </tr>
    <br>
    <br>
</div>
</body>
</html>
