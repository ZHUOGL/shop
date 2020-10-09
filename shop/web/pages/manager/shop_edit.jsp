<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>编辑商品</title>
    <%@ include file="/common/Head.jsp" %>
    <style type="text/css">
        h1 {
            text-align: center;
            margin-top: 200px;
        }

        h1 a {
            color: red;
        }

        input {
            text-align: center;
        }
    </style>
    <script>
        $(function () {
            $("#sub_btn")
        })
    </script>
</head>
<body>
<div id="header">
    <img class="logo_img" alt="" src="static/img/logo.gif">
    <span class="wel_word">编辑商品</span>
    <%--			<%@include file="/pages/manager_menu.jsp" %>--%>
    <div>
        <a href="/pages/manager/shop_manager.jsp">商品管理</a>
        <a href="/pages/manager/order_manager.jsp">订单管理</a>
        <a href="index.jsp">返回商城</a>
    </div>
</div>

<div id="main">
    <form action="GoodsServlet">
        <input type="hidden" name="action" value="${empty param.id ? "add":"update"}">
        <input type="hidden" name="id" value="${requestScope.goods.id}">
        <input type="hidden" name="pageNo" value="${param.pageNo}">
        <table>
            <tr>
                <td>名称</td>
                <td>价格</td>
                <td>品牌</td>
                <td>销量</td>
                <td>库存</td>
                <td colspan="2">操作</td>
            </tr>
            <tr>
                <td><input name="name" type="text" value="${requestScope.goods.name}"/></td>
                <td><input name="price" type="text" value="${requestScope.goods.price}"/></td>
                <td><input name="producer" type="text" value="${requestScope.goods.producer}"/></td>
                <td><input name="sales" type="text" value="${requestScope.goods.sales}"/></td>
                <td><input name="stock" type="text" value="${requestScope.goods.stock}"/></td>
                <td><input type="submit" value="提交" id="sub_btn"/></td>
            </tr>
        </table>
    </form>


</div>

<div id="bottom">
			<span>
				网上商城.Copyright &copy;2020
			</span>
</div>
</body>
</html>
