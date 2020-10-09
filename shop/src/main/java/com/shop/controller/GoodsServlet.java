package com.shop.controller;

import com.shop.bean.Goods;
import com.shop.bean.Page;
import com.shop.service.GoodsService;
import com.shop.service.Impl.GoodsServiceImpl;
import com.shop.utils.WebUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


public class GoodsServlet extends BaseServlet {
    GoodsService goodsService = new GoodsServiceImpl();

    protected void list(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("list方法被调用");
        List<Goods> goodsList = goodsService.queryGoods();
        System.out.println(goodsList);
        req.setAttribute("goods", goodsList);
        req.getRequestDispatcher("/pages/manager/shop_manager.jsp").forward(req, resp);
    }

    protected void add(HttpServletRequest req, HttpServletResponse resp) throws ServletException,
            IOException {
//       1、获取请求的参数==封装成为Goods对象
        Goods goods = WebUtils.copyParamToBean(new Goods(), req.getParameterMap());
//       2、goodsService.addGoods()保存商品
        goodsService.addGoods(goods);
//       3、跳到商品列表页面
//             /manager/GoodsServlet?action=list
//       req.getRequestDispatcher("/manager/GoodsServlet?action=list").forward(req, resp);
        System.out.println(req.getContextPath());
        resp.sendRedirect(req.getContextPath() + "/GoodsServlet?action=page");
    }

    protected void delete(HttpServletRequest req, HttpServletResponse resp) throws ServletException,
            IOException {
//        1、获取请求的参数 id，商品编程
        int id = WebUtils.parseInt(req.getParameter("id"), 0);
//        2、goodsService.deleteGoodsById();删除商品
        goodsService.deleteGoodsById(id);
//        3、重定向回商品列表管理页面
        resp.sendRedirect(req.getContextPath() + "/GoodsServlet?action=page");
    }

    protected void getGoods(HttpServletRequest req, HttpServletResponse resp) throws ServletException,
            IOException {
        //1 获取请求的参数商品编号
        int id = WebUtils.parseInt(req.getParameter("id"), 0);
        //2 调用goodsService.queryGoodsById 查询商品
        Goods goods = goodsService.queryGoodsById(id);
        //3 保存到商品到Request 域中
        req.setAttribute("goods", goods);
        //4 请求转发到。pages/manager/goods_edit.jsp 页面
        req.getRequestDispatcher("/pages/manager/shop_edit.jsp").forward(req, resp);
    }

    protected void update(HttpServletRequest req, HttpServletResponse resp) throws ServletException,
            IOException {
//       1、获取请求的参数==封装成为Goods 对象
        Goods goods = WebUtils.copyParamToBean(new Goods(), req.getParameterMap());
//       2、调用GoodsService.updateGoods(goods);修改goods
        goodsService.updateGoods(goods);
//       3、重定向回goods列表管理页面
//       地址：/工程名/manager/GoodsServlet?action=list
        resp.sendRedirect(req.getContextPath() + "/GoodsServlet?action=page&pageNo=" + req.getParameter("pageNo"));
    }

    protected void page(HttpServletRequest req, HttpServletResponse resp) throws ServletException,
            IOException {
        //1 获取请求的参数 pageNo 和 pageSize
        System.out.println("page方法");

        int pageNo = WebUtils.parseInt(req.getParameter("pageNo"), 1);
        int pageSize = WebUtils.parseInt(req.getParameter("pageSize"), Page.PAGE_SIZE);
        //2 调用GoodsService.page(pageNo，pageSize)：Page 对象
        Page<Goods> page = goodsService.page(pageNo, pageSize);
        //3 保存Page 对象到Request 域中
        System.out.println(page);
        req.setAttribute("page", page);
        //4 请求转发到pages/manager/goods_manager.jsp 页面
        req.getRequestDispatcher("/pages/manager/shop_manager.jsp").forward(req, resp);
    }

}
