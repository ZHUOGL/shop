<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/7/24/024
  Time: 15:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="vehicle.jsp" method="post">
    <input type="checkbox" name="car"  value="地铁" />地铁<br>
    <input type="checkbox" name="car"  value="公共汽车" />公共汽车<br>
    <input type="checkbox" name="car"  value="小车" />小车<br>
    <input type="checkbox" name="car"  value="自行车" />自行车<br>
    <input type="submit" value="提交"/>
</form>
<%
    request.setCharacterEncoding("UTF-8");
    response.setCharacterEncoding("UTF-8");
    try {
        String[] cars = request.getParameterValues("car");
        out.print("你选择的交通工具:");
        for (String car : cars) {
            out.print(car);
        }
    }catch (Exception e){
        out.print("请选择");
    }



%>
</body>
</html>
