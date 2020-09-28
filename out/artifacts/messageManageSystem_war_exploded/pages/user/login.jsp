<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/09/25
  Time: 19:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <title>登录</title>
    <base href="<%=basePath%>>">
</head>
<%--<script type="text/javascript" src="jquery-1.7.2.js"></script>--%>
<script>
    function check() {
        var na = document.form1.loginname.value;
        var pwd = document.form1.password.value;
        if (na == "") {
            alert("用户名不能为空！")
            return false;
        }
        if (pwd == "") {
            alert("密码不能为空！")
            return false;
        }
    }
</script>
<body>
<form name="form1">
    <table border="1px" align="center" width="300px" style="text-align: center">
        <tr>
            <td colspan="2"><h4>${message}</h4></td>
        </tr>
        <tr>
            <td>用户名:</td>
            <td><input name="loginname" type="text" id="input1" value="${loginname}"></td>
        </tr>
        <tr>
            <td>密码:</td>
            <td><input name="password" type="password" id="input2"></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="登录" id="submit1" formmethod="post" formaction="LoginServlet"
                                   onsubmit="return check()"/><a href="pages/user/regist.jsp">注册</a></td>
        </tr>

    </table>
</form>
</body>
</html>
