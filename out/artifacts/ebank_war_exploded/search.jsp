<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/09/14
  Time: 18:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%String message = (String) request.getAttribute("message");%>
<html>
<head>
    <title>话费自助缴存系统</title>
</head>
<body>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>话费自助缴存系统</title>
</head>
<body>
<%if (message != null) {%>
<h3>
    <%=message%>
</h3>
<%}%>

<table align="center" border="1px solid blue">
    <tr align="center">
        <td>话费自助缴存系统</td>
    </tr>
    <form method="post" action="SearchServlet">
        <tr align="center">
            <td>电话号码：<input name="phoneNumber" type="text"/></td>
        </tr>
        <tr align="center">
            <td><input type="submit" value="查询"/></td>
        </tr>
    </form>
</table>
</body>
</html>
</body>
</html>
