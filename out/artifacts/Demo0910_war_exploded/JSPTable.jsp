<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/09/10
  Time: 11:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>For表格</title>
</head>
<body>

<table border="1" cellspacing="0">
    <%
        for (int i = 0; i < 5; i++) {
    %>
    <tr>
        <td>
            第<%=%>i%>行
        </td>
    </tr>
    <%
        }
    %>

</table>
</body>
</html>
