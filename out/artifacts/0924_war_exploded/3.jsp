<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/09/24
  Time: 15:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>JSTL1</title>
</head>
<body>
session:<br>
保存之前：${ sessionScope.abc } <br>
<c:set scope="session" var="abc" value="abcValue"/>
保存之后：${ sessionScope.abc } <br>
<br>
if标签<br>
<c:if test="&(1==1)"><h1>1等于1</h1></c:if>
<c:set scope="session" var="score" value="50"/>
<c:choose>
    <c:when test="${sessionScope.score>89}"><h2>优</h2></c:when>
    <c:when test="${sessionScope.score>69}"><h2>良</h2></c:when>
    <c:when test="${sessionScope.score>59}"><h2>及格</h2></c:when>
    <c:otherwise><h2>不及格！</h2></c:otherwise>
</c:choose>

</body>
</html>
