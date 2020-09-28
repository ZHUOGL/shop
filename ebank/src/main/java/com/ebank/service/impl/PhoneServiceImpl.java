package com.ebank.service.impl;

import com.ebank.dao.PhoneDao;
import com.ebank.dao.impl.PhoneDaoImpl;
import com.ebank.entity.Phone;
import com.ebank.service.PhoneService;

public class PhoneServiceImpl implements PhoneService {
    PhoneDao phoneDao = new PhoneDaoImpl();

    @Override
    public Phone queryByPhone(String phoneNumber) {
        return phoneDao.queryByPhone(phoneNumber);
    }

    @Override
    public int update(Phone phone) {
        return phoneDao.update(phone);
    }
}
