<%@ page import="com.messageManageSystem.entity.Message" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/09/26
  Time: 16:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>登录成功</title>
</head>
<body>
<div align="center" style="margin: 0 auto; background: #5bc0de;width: 800px;text-align: left;border: 1px" >
    <tr>
        <span style="float: right;">当前用户:<strong>${loginname}</strong> <strong>发短消息</strong> <strong>退出</strong>
        </span>
    </tr>
    <hr>
    <br><br>
    <c:forEach items="${requestScope.messages}" var="message">
        <tr>
            <td><strong>${message.title}</strong></td>
            <td>${message.info}</td>
            <span style="float: right">${message.sendTime}&nbsp;</span>
            <span style="float: right">回信&nbsp;</span>
            <span style="float: right">删除&nbsp;</span>


        </tr>
        <hr>
        <br>
    </c:forEach>

</div>
</body>
</html>
