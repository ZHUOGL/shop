<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/7/24/024
  Time: 16:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>详细内容</title>
</head>
<body>
<%
    HashMap<String, ArrayList> stringStringHashMap = new HashMap<>();
    ArrayList<String> strings = new ArrayList<>();
    ArrayList<String> strings2 = new ArrayList<>();
    strings.add("images/1.jpg");
    strings.add("王者荣耀简介");
    strings2.add("images/2.jpg");
    strings2.add("吃鸡简介");
    stringStringHashMap.put("1", strings);
    stringStringHashMap.put("2", strings2);

    String id = request.getParameter("id");
    String imag = (String) stringStringHashMap.get(id).get(0);
    String text = (String) stringStringHashMap.get(id).get(1);

%>

<p><img src="<%=imag%>"/>
<p>
<p><%=text%>
</p>
</body>
</html>
