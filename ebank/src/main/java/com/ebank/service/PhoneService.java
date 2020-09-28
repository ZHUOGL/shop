package com.ebank.service;

import com.ebank.entity.Phone;

public interface PhoneService {
    Phone queryByPhone(String phoneNumber);

    int update(Phone phone);
}
