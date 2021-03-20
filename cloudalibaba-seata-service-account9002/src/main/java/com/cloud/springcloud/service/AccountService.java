package com.cloud.springcloud.service;

import com.cloud.springcloud.entity.Account;
import com.cloud.springcloud.entity.Storage;

/**
 * @PackageName: com.cloud.springcloud.service
 * @ClassName: StorageService
 * @Description: This is StorageService interface by Skwen.
 * @Author: Skwen
 * @Date: 2021-03-20 21:54
 */
public interface AccountService {
    int updateOne(Account account);
}
