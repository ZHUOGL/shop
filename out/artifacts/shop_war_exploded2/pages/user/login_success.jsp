<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/common/Head.jsp" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>网上商城会员注册页面</title>
    <link type="text/css" rel="stylesheet" href="static/css/style.css">
    <link href="static/css/bootstrap.min.css" rel="stylesheet"/>
    <script src="static/js/jquery-1.11.3.min.js"></script>
    <script src="static/js/bootstrap.js"></script>
    <style type="text/css">
        h1 {
            text-align: center;
            margin-top: 200px;
        }

        h1 a {
            color: red;
        }
    </style>
</head>
<body>
<div id="header">
    <img class="logo_img" alt="" src="static/img/logo.gif">
    <div>
        <span>欢迎<span class="um_span">用户</span>光临网上商城</span>
        <a href="pages/order/order.html">我的订单</a>
        <a href="LoginServlet?action=logout">注销</a>&nbsp;&nbsp;
        <a href="pages/index.jsp">返回</a>
    </div>
</div>

<div id="main">

    <h1>欢迎回来 <a href="index.jsp">转到主页</a></h1>

</div>
<%@ include file="/common/Bottom.jsp" %>
</body>
</html>
