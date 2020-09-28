package com.ebank.test;

import com.ebank.dao.PhoneDao;
import com.ebank.dao.impl.PhoneDaoImpl;
import com.ebank.entity.Phone;
import org.junit.Test;

public class PhoneDaoTest {
    PhoneDao phoneDao = new PhoneDaoImpl();

    @Test
    public void testQueryByPhoneNumber() {
        System.out.println(phoneDao.queryByPhone("12345"));
    }

    @Test
    public void testUpdate() {

        Phone phone = new Phone();
        phone.setPhoneNumber("12345");
        phone.setCost(30.0);
        phone.setStatus((byte) 0);
        System.out.println(phoneDao.update(phone));
    }
}
