<%@ page import="com.ebank.entity.Phone" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/09/14
  Time: 16:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% Phone phone = (Phone) request.getServletContext().getAttribute("phone");%>
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
<table align="center" border="1px solid blue">
    <tr align="center">
        <td>话费自助缴存系统</td>
    </tr>
    <form method="post" action="SearchServlet">
        <tr align="center">
            <td>电话号码：<%=phone.getPhoneNumber()%></td>
        </tr>
        <tr align="center">
            <td>您已经缴纳了本月话费。<a href="search.jsp">返回首页</a></td>
        </tr>
    </form>
</table>
</body>
</html>
</body>
</html>
