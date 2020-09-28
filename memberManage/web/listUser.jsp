<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>用户列表</title>
    <script type="text/javascript" src="jquery-1.7.2.js"></script>
    <script>
        function show() {
            document.getElementById("tab2").style.display="";
            // $("#tab2").style.display="block";
            // if (s == none) {
            //     $("#tab2").style.display = 'block';
            // }

        }
    </script>
</head>
<body>
<table bgcolor="aqua" width="200px" style="margin-left: 300px">
    <tr>
        <td onclick="show()">用户管理</td>
    </tr>
    <tr>
        <td>权限管理</td>
    </tr>
    <tr>
        <td>系统管理</td>
    </tr>
    <tr>
        <td>退出系统</td>
    </tr>
</table>
<table align="center" border="1px solid blue" width="800px" style="display: none" id="tab2">
    <tr>
        <td>ID</td>
        <td>用户名</td>
        <td>头像</td>
        <td>昵称</td>
        <td>操作</td>
    </tr>
</table>
</body>
</html>