package com.ebank.dao.impl;

import com.ebank.dao.BaseDao;
import com.ebank.dao.PhoneDao;
import com.ebank.entity.Phone;

public class PhoneDaoImpl extends BaseDao implements PhoneDao {

    @Override
    public Phone queryByPhone(String phoneNumber) {
        String sql = "SELECT * FROM Phone WHERE phoneNumber=?";
        return queryForOne(Phone.class, sql, phoneNumber);
    }

    @Override
    public int update(Phone phone) {
        String sql = "UPDATE Phone SET cost=?, status=? WHERE phoneNumber=?";
        phone.setCost(0.0);
        phone.setStatus((byte) 1);
        return update(sql, phone.getCost(), phone.getStatus(), phone.getPhoneNumber());
    }
}
