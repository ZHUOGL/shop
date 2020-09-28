<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/09/10
  Time: 11:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>乘法表</title>
</head>
<body>
<h2>99乘法表</h2>
<%
    for (int i = 1; i < 10; i++) {
        for (int j = 1; j <= i; j++) {
%>

<%=j%>*<%=i%>=<%=i * j%>&nbsp;

<%

    }%>
<br>
<%
    }
%>
</body>
</html>
