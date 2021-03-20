package com.cloud.springcloud.service.impl;

import com.cloud.springcloud.dao.AccountDao;
import com.cloud.springcloud.entity.Account;
import com.cloud.springcloud.entity.Storage;
import com.cloud.springcloud.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @PackageName: com.cloud.springcloud.service.impl
 * @ClassName: StorageServiceImpl
 * @Description: This is StorageServiceImpl class by Skwen.
 * @Author: Skwen
 * @Date: 2021-03-20 21:55
 */
@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao dao;

    @Override
    public int updateOne(Account account) {
        return dao.updateOne(account);
    }
}
