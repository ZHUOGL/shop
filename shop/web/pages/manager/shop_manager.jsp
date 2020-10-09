<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>商品管理</title>
    <%@ include file="/common/Head.jsp" %>
    <script type="text/javascript">
        $(function () {
            // 给删除的a 标签绑定单击事件，用于删除的确认提示操作
            $("a.deleteClass").click(function () {
                // 在事件的function 函数中，有一个this 对象。这个this 对象，是当前正在响应事件的dom 对象。
                /**
                 * confirm 是确认提示框函数
                 * 参数是它的提示内容
                 * 它有两个按钮，一个确认，一个是取消。
                 * 返回true 表示点击了，确认，返回false 表示点击取消。
                 */
                return confirm("你确定要删除 【" + $(this).parent().parent().find("td:first").text() + "】?");
                // return false// 阻止元素的默认行为===不提交请求
            });
        });
    </script>
</head>
<body>

<div id="header">
    <img class="logo_img" alt="" src="static/img/logo.gif">
    <span class="wel_word">商品管理系统</span>
    <div>
        <a href="pages/manager/shop_manager.jsp">商品管理</a>
        <a href="pages/manager/order_manager.jsp">订单管理</a>
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
        <c:forEach items="${requestScope.page.items}" var="good">

            <tr>
                <td>${good.name}</td>
                <td>${good.price}</td>
                <td>${good.producer}</td>
                <td>${good.sales}</td>
                <td>${good.stock}</td>

                <td><a href="GoodsServlet?action=getGoods&id=${good.id}">修改</a></td>
                <td><a class="deleteClass" href="manager/GoodsServlet?action=delete&id=${good.id}">删除</a></td>
            </tr>
        </c:forEach>
        <tr>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <%--            <td><a href="GoodsServlet?action=add&id=${good.id}">添加商品</a></td>--%>
            <td><a href="pages/manager/shop_edit.jsp">添加商品</a></td>
        </tr>
    </table>
</div>
<div id="page_nav">
    <%--大于首页，才显示--%>
    <c:if test="${requestScope.page.pageNo > 1}">
        <a href="GoodsServlet?action=page&pageNo=1">首页</a>
        <a href="GoodsServlet?action=page&pageNo=${requestScope.page.pageNo-1}">上一页</a>
    </c:if>


    <a href="#">3</a>
    【${ requestScope.page.pageNo }】
    <a href="#">5</a>
    <%-- 如果已经 是最后一页，则不显示下一页，末页 --%>
    <c:if test="${requestScope.page.pageNo < requestScope.page.pageTotal}">
        <a href="GoodsServlet?action=page&pageNo=${requestScope.page.pageNo+1}">下一页</a>
        <a href="GoodsServlet?action=page&pageNo=${requestScope.page.pageTotal}">末页</a>
    </c:if>
    共${ requestScope.page.pageTotal }页，${ requestScope.page.pageTotalCount }条记录
    到第<input value="4" name="pn" id="pn_input"/>页
    <input type="button" value="确定" id="searchPageBtn">
        <script type="text/javascript">
            $(function () {
                // 跳到指定的页码
                $("#searchPageBtn").click(function () {
                    var pageNo = $("#pn_input").val();
                    <%--var pageTotal = ${requestScope.page.pageTotal};--%>
                    <%--alert(pageTotal);--%>
                    // javaScript 语言中提供了一个 location 地址栏对象
                    // 它有一个属性叫href .它可以获取浏览器地址栏中的地址
                    // href 属性可读，可写
                    location.href = "${pageScope.basePath}GoodsServlet?action=page&pageNo=" + pageNo;
                });
            });
        </script>
</div>
<div id="bottom">
			<span>
				网上商城.Copyright &copy;2020
			</span>
</div>
</body>
</html>
