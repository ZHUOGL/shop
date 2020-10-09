package com.shop.dao.impl;

import com.shop.bean.Goods;
import com.shop.dao.BaseDao;
import com.shop.dao.GoodsDao;

import java.util.List;

public class GoodsDaoImpl extends BaseDao implements GoodsDao {
    @Override
    public int addGoods(Goods goods) {
        String sql = "INSERT INTO t_goods (name,producer,price,sales,stock,img_path) VALUES (?,?,?,?,?,?)";
        return update(sql, goods.getName(), goods.getProducer(), goods.getPrice(),
                goods.getSales(), goods.getStock(), goods.getImgPath());
    }

    @Override
    public int deleteGoodsById(Integer id) {
        String sql = "DELETE FROM t_goods WHERE id=?";
        return update(sql, id);
    }

    @Override
    public int updateGoods(Goods goods) {
        String sql = "UPDATE T_goods SET `name`=?,`producer`=?,`price`=?,`sales`=?,`stock`=?,`img_path`=? WHERE `id` = ?";
        return update(sql, goods.getName(), goods.getProducer(), goods.getPrice(), goods.getSales(), goods.getStock(), goods.getImgPath(), goods.getId());
    }

    @Override
    public Goods queryGoodsById(Integer id) {
        String sql = "SELECT `id` , `name` , `producer` , `price` , `sales` , `stock` , `img_path` imgPath FROM `T_goods` WHERE id = ?";
        return queryForOne(Goods.class, sql, id);
    }

    @Override
    public List<Goods> queryGoods() {
        String sql = "SELECT `id` , `name` , `producer` , `price` , `sales` , `stock` , `img_path` FROM `T_goods`";
        return queryForList(Goods.class, sql);
    }

    @Override
    public Integer queryForPageTotalCount() {
        String sql = "select count(*) from t_goods";
        Number count = (Number) queryForSingleValue(sql);
        return count.intValue();
    }

    @Override
    public List<Goods> queryForPageItems(int begin, int pageSize) {
        String sql = "SELECT id , name , producer , price , sales , stock , img_path FROM t_goods LIMIT ?,?";
        return queryForList(Goods.class, sql, begin, pageSize);
    }
}
