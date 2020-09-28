<%@ page import="java.util.List" %>
<%@ page import="entity.Student" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/09/23
  Time: 9:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
$END$
<form action="Servlet1" method="get">
    <tr align="center">
        <td><input type="submit" value="加载"/></td>
    </tr>
    <br>
    <tr><h1>九九乘法表</h1></tr>
    <table border="1px solid:blue">
        <%
            for (int i = 1; i < 10; i++) {
                for (int j = 1; j <= i; j++) {
        %>

        <%
                out.println(j + "*" + i + "=" + i * j + " ");
            }
        %>
        <br>
        <%
            }
        %>
    </table>
    </br>
    <% List<Student> students = (List<Student>) request.getAttribute("all");%>
    <%int len = students.size();%>
    <table border="2px">

        <%
            for (int i = 0; i < len; i++) {
        %>
        <tr>
            <td>
                <%
                    out.println(students.get(i).toString());
                %>
            </td>
        </tr>
        <%
            }
        %>
<%--        <c:forEach items="${requestScope.all}" var="stu">--%>
<%--            <tr>--%>
<%--                <td>${stu.id}</td>--%>
<%--                <td>${stu.name}</td>--%>
<%--                <td>${stu.age}</td>--%>
<%--                <td>${stu.phone}</td>--%>
<%--            </tr>--%>
<%--        </c:forEach>--%>

    </table>

</form>
</body>
</html>
