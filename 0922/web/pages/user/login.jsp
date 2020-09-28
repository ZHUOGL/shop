<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%String message = (String) request.getAttribute("message");%>
<%String loginName = (String) request.getAttribute("loginName");%>
<%@ include file="/common/Head.jsp" %>
<html>
<head>
    <base href="<%=basePath%>">
    <meta charset="UTF-8">
    <title>网上商城会员登录页面</title>
    <link type="text/css" rel="stylesheet" href="static/css/style.css">
    <link href="static/css/bootstrap.min.css" rel="stylesheet"/>
    <script src="static/js/jquery-1.11.3.min.js"></script>
    <script src="static/js/bootstrap.js"></script>
</head>
<body>
<div id="login_header">
    <img class="logo_img" alt="" src="static/img/logo.gif">
</div>

<div class="login_banner">

    <div id="l_content">
        <span class="login_word">欢迎登录</span>
    </div>

    <div id="content">
        <div class="login_form">
            <div class="login_box">
                <div class="tit">
                    <h1>网上商城会员</h1>
                    <a href="pages/user/regist.html">立即注册</a>
                </div>
                <div class="msg_cont">
                    <b></b>
                    <span class="errorMsg">请输入用户名和密码</span>
                </div>
                <div class="form">
                    <form action="LoginServlet" method="post">
                        <label>用户名称：</label>
                        <input class="itxt" type="text" placeholder="请输入用户名" autocomplete="off" tabindex="1"
                               name="username"/>
                        <br/>
                        <br/>
                        <label>用户密码：</label>
                        <input class="itxt" type="password" placeholder="请输入密码" autocomplete="off" tabindex="1"
                               name="password"/>
                        <br/>
                        <br/>
                        <input type="submit" value="登录" id="sub_btn"/>
                        <br/>
                        <%if (message != null) {%>
                        <h3>
                            <%=message%>
                        </h3>
                        <%}%>
                    </form>
                </div>

            </div>
        </div>
    </div>
</div>
<%@ include file="/common/Bottom.jsp" %>
</body>

</html>
