<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/09/24
  Time: 19:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>第四题</title>
</head>
<body>
<%
    List<String> list = new ArrayList<String>();
    list.add("李芙蓉");
    list.add("杨芙蓉");
    list.add("王凤");
    request.setAttribute("list", list);

%>
<c:forEach items="${requestScope.list}" var="i" begin="0">
    <tr>
        <td>${i}</td>
    </tr>
</c:forEach>
</body>
</html>
