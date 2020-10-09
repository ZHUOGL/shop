package com.shop.test;

import com.shop.bean.Goods;
import com.shop.dao.GoodsDao;
import com.shop.dao.impl.GoodsDaoImpl;
import com.shop.service.GoodsService;
import com.shop.service.Impl.GoodsServiceImpl;
import org.junit.Test;

import java.math.BigDecimal;

public class GoodsServiceImplTest {
    GoodsService goodsService = new GoodsServiceImpl();
    GoodsDao goodsDao = new GoodsDaoImpl();

    @Test
    public void testAddGoods() {
        Goods good = new Goods("测试添加", "卓", new BigDecimal(5.1), 1, 1, "无");
        int result = goodsService.addGoods(good);
        System.out.println(result);
    }

    @Test
    public void testDeleteGoodsById() {
        int result = goodsService.deleteGoodsById(27);
        System.out.println(result);
    }

    @Test
    public void testUpdateGoods() {
        Goods good = new Goods(1, "小米", "华农兄弟", new BigDecimal(50), 5, 5, "不知道哦");
        int result = goodsService.updateGoods(good);
        System.out.println(result);
    }

    @Test
    public void testqueryGoodsById() {
        Goods good = goodsService.queryGoodsById(1);
        System.out.println(good);
    }

    @Test
    public void testqueryGoods() {
        System.out.println(goodsService.queryGoods());
    }

    @Test
    public void testqueryForPageTotalCount() {
        System.out.println(goodsService.queryForPageTotalCount());
    }

    @Test
    public void testqueryForPageItems() {
        //System.out.println(goodsDao.queryForPageItems(0,1));
        System.out.println(goodsService.queryForPageItems(0, 2));
    }
    @Test
    public void testpage() {
        System.out.println(goodsService.page(1,2));
    }
}
