<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/09/23
  Time: 15:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getScheme()
            + "://"
            + request.getServerName()
            + ":"
            + request.getServerPort()
            + request.getContextPath()
            + "/";
%>
<base href="<%=basePath%>">
<link type="text/css" rel="stylesheet" href="static/css/style.css">
<link href="static/css/bootstrap.min.css" rel="stylesheet"/>
<script src="static/js/jquery-1.11.3.min.js"></script>
<script src="static/js/bootstrap.js"></script>
