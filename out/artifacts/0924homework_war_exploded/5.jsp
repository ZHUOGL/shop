<%@ page import="java.util.List" %>
<%@ page import="entity.Employee" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/09/24
  Time: 20:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    List<Employee> employees = new ArrayList<Employee>();
    employees.add(new Employee("张三", "man"));
    employees.add(new Employee("李四", "woman"));
    employees.add(new Employee("王五", "woman"));
    employees.add(new Employee("赵六", "man"));
    request.setAttribute("employees", employees);
%>
<html>
<head>
    <title>第五题</title>
</head>
<body>
<table border="1px" width="400px" align="center" style="text-align: center">
    <tr>
        <td>姓名</td>
        <td>性别</td>
    </tr>
    <c:forEach items="${requestScope.employees}" var="emp">
        <tr>
            <td>${emp.name}</td>
            <td>
                <c:if test="${emp.gender=='man'}">男</c:if>
                <c:if test="${emp.gender=='woman'}">女</c:if>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
