package com.ebank.dao;

import com.ebank.entity.Phone;

public interface PhoneDao {

    Phone queryByPhone(String phone);

    int update(Phone phone);
}
