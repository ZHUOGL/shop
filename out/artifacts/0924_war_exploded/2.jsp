<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/09/24
  Time: 10:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%request.setAttribute("req",request);%>
<%=request.getScheme()%>它可以获取请求的协议<br>
<%=request.getServerName()%>它可以获取的服务器ip地址 或域名<br>
<%=request.getServletPath()%>它可以获取请求的服务器端口<br>
<%=request.getContextPath()%>获取当前工程路劲<br>
<%=request.getMethod()%>获取请求方法<br>
<%=request.getRemoteHost()%>获取客服端的IP地址<br>
<%=session.getId()%>获取会话的唯一标识<br>
<%request.setAttribute("req", request);%>
1.协议：${req.scheme}<br>
2.服务器ip：${pageContext.request.serverName}<br>
3.服务器端口：${pageContext.request.serverPort}<br>
4.获取工程路径：${pageContext.request.contextPath}<br>
5.获取请求方法：${pagecontext.request.method}<br>
6.获取客服端的IP地址${pageContext.request.remoteHost}<br>
7.获取会话的唯一标识${pageContext.session.id}<br>

</body>
</html>
