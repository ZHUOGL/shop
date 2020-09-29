<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%String loginName = (String) request.getAttribute("loginName");%>
<html>
<head>
    <%@ include file="/common/Head.jsp" %>
    <meta charset="UTF-8">
    <title>网上商城会员登录页面</title>
    <script>
        $(function () {
            //验证账号合法

            $("#input1").focusout(function () {
                $.ajax({
                    url: "http://localhost:8080/shop_war_exploded2/LoginServlet",
                    data: {action: $("#input1").val()},
                    type: "GET",
                    success: function (data) {
                        //alert("服务器返回的数据是：" + data);
                        //var jsonObj = JSON.parse(data);
                        $("#span1").html(data);
                    },
                    dataType: "text"
                });
            });
            // $("sub_btn").click(function () {
            //     $.ajax({
            //         url: "http://localhost:8080/shop_war_exploded2/LoginServlet",
            //         data: {username: $("#input1").val(), password: $("#password1"), code: $("#code")},
            //         type: "POST",
            //         success: function (data) {
            //             $("#span2").html(data);
            //         }
            //     })
            // })
        })
    </script>
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
                    <a href="pages/user/regist.jsp">立即注册</a>
                </div>
                <div class="msg_cont">
                    <b></b>
                    <span class="errorMsg">请输入用户名和密码</span>
                </div>
                <div class="form">
                    <form action="LoginServlet" method="post">
                        <label>用户名称：</label>
                        <input class="itxt" type="text" placeholder="请输入用户名" autocomplete="off" tabindex="1"
                               name="username" id="input1"/>
                        <span id="span1"></span>
                        <br/>
                        <br/>
                        <label>用户密码：</label>
                        <input class="itxt" type="password" placeholder="请输入密码" autocomplete="off" tabindex="1"
                               name="password" id="password1"/>
                        <span id="span2"></span>
                        <br/>
                        <br/>
                        <img src="kaptcha.jpg" alt="" style="width: 200px; height: 35px;" align="center">
                        <br/>
                        <br/>
                        <label>验证码：</label>
                        <input class="itxt" type="text" placeholder="请输入验证码" autocomplete="off" tabindex="1"
                               name="code" id="code"/>
                        <span id="span3"></span>
                        <br>
                        <input type="submit" value="登录" id="sub_btn"/>
                        <br/>

                        <h3>
                            ${requestScope.message}
                        </h3>

                    </form>
                </div>

            </div>
        </div>
    </div>
</div>
<%@ include file="/common/Bottom.jsp" %>
</body>

</html>
