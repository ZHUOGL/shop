package com.shop.dao;

import com.shop.bean.Goods;

import java.util.List;

public interface GoodsDao {
    public int addGoods(Goods goods);

    public int deleteGoodsById(Integer id);

    public int updateGoods(Goods goods);

    public Goods queryGoodsById(Integer id);

    public List<Goods> queryGoods();

    public Integer queryForPageTotalCount();

    public List<Goods> queryForPageItems(int begin, int pageSize);
}
