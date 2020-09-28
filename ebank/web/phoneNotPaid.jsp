<%@ page import="com.ebank.entity.Phone" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% Phone phone = (Phone) request.getServletContext().getAttribute("phone");%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>话费自助缴存系统</title>
    <script>
        function click() {
            Location.href = "failed.html";
        }
    </script>
</head>
<body>
<table align="center" border="1px solid blue">
    <tr align="center">
        <td>话费自助缴存系统</td>
    </tr>
    <form action="SearchServlet" method="post">
        <input style="display: none" name="pay" value="pay"/>
        <tr align="center">
            <td>电话号码：<%=phone.getPhoneNumber()%>
            </td>
        </tr>
        <tr align="center">
            <td>本月话费：<%=phone.getCost()%>
            </td>
        </tr>
        <tr align="center">
            <td><input type="submit" value="确认缴费"/>
                <%--                <button onclick="click()">取消</button>--%>
                <a href="failed.html">取消</a>
            </td>

        </tr>
    </form>
</table>
</body>
</html>