<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%String loginName = (String) request.getAttribute("loginName");%>
<html>
<head>
    <%@ include file="/common/Head.jsp" %>
    <%--    <%=basePath%>--%>
    <meta charset="UTF-8">
    <title>网上商城会员登录页面</title>
    <script>
        $(function () {
            //验证账号合法
            $("#input1").focusout(function () {
                $.ajax({
                    url: "http://localhost:8080/shop_war_exploded2/UserServlet",
                    data: {action: "loginHelp", loginname: $("#input1").val()},
                    type: "POST",
                    success: function (data) {
                        //alert("服务器返回的数据是：" + data);
                        //var jsonObj = JSON.parse(data);
                        $("#span1").html(data);
                    },
                    dataType: "text"
                });
            });
            //点击刷新验证码
            $("#code_img").click(function () {

                // 在事件响应的function 函数中有一个this 对象。这个this 对象，是当前正在响应事件的dom 对象
                // src 属性表示验证码 img 标签的 图片路径。它可读，可写
                // alert(this.src);
                this.src = "${basePath}kaptcha.jpg?d=" + new Date();
            });
            $("#sub_btn").click(function () {
                console.log("测试");
                var loginname = $("#input1").val();
                var pwd = $("#password1").val();
                var code = $("#code").val();
                console.log(loginname);
                if (loginname == null || loginname == "") {
                    $(".errorMsg").text("请输入账号！");
                    return false;
                }
                if (pwd == null || pwd == "") {
                    $(".errorMsg").text("请输入密码！");
                    return false;
                }
                if (code == null || code == "") {
                    $(".errorMsg").text("请输入验证码！");
                    return false;
                }
            });
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
                    <form action="UserServlet" method="post">
                        <input type="hidden" name="action" value="login">
                        <label>用户名称：</label>
                        <input class="itxt" type="text" placeholder="请输入用户名" autocomplete="off" tabindex="1"
                               name="username" id="input1" value="${requestScope.username}"/>
                        <span id="span1"></span>
                        <br/>
                        <br/>
                        <label>用户密码：</label>
                        <input class="itxt" type="password" placeholder="请输入密码" autocomplete="off" tabindex="1"
                               name="password" id="password1"/>
                        <br/>
                        <br/>
                        <img src="kaptcha.jpg" alt="" style="width: 200px; height: 35px;" align="center" id="code_img">
                        <span>${message}</span>
                        <br/>
                        <br/>
                        <label>验证码：</label>
                        <input class="itxt" type="text" placeholder="请输入验证码" autocomplete="off" tabindex="1"
                               name="code" id="code"/>
                        <br>
                        <input type="submit" value="登录" id="sub_btn"/>
                        <br/>
                    </form>
                </div>

            </div>
        </div>
    </div>
</div>

<span>${requestScope.basePath};</span>

<%@ include file="/common/Bottom.jsp" %>
</body>

</html>
