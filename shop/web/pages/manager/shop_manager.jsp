<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
	<head>
		<meta charset="UTF-8">
		<title>商品管理</title>
		<%@ include file="/common/Head.jsp" %>
	</head>
	<body>

		<div id="header">
			<img class="logo_img" alt="" src="static/img/logo.gif">
			<span class="wel_word">商品管理系统</span>
			<div>
				<a href="/pages/manager/shop_manager.jsp">商品管理</a>
				<a href="/pages/manager/order_manager.jsp">订单管理</a>
				<a href="index.jsp">返回商城</a>
			</div>
		</div>

		<div id="main">
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
					<td>滚筒洗衣机</td>
					<td>500.0</td>
					<td>奥利给</td>
					<td>200</td>
					<td>400</td>
					<td><a href="/pages/manager/shop_edit.jsp">修改</a></td>
					<td><a href="#">删除</a></td>
				</tr>

				<tr>
					<td>滚筒洗衣机</td>
					<td>500.0</td>
					<td>奥利给</td>
					<td>200</td>
					<td>400</td>
					<td><a href="/pages/manager/shop_edit.jsp">修改</a></td>
					<td><a href="#">删除</a></td>
				</tr>

				<tr>
					<td>滚筒洗衣机</td>
					<td>500.0</td>
					<td>奥利给</td>
					<td>200</td>
					<td>400</td>
					<td><a href="/pages/manager/shop_edit.jsp">修改</a></td>
					<td><a href="#">删除</a></td>
				</tr>

				<tr>
					<td>滚筒洗衣机</td>
					<td>500.0</td>
					<td>奥利给</td>
					<td>200</td>
					<td>400</td>
					<td><a href="/pages/manager/shop_edit.jsp">修改</a></td>
					<td><a href="#">删除</a></td>
				</tr>

				<tr>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td><a href="/pages/manager/shop_edit.jsp">添加商品</a></td>
				</tr>
			</table>
		</div>

		<div id="bottom">
			<span>
				网上商城.Copyright &copy;2020
			</span>
		</div>
	</body>
</html>
