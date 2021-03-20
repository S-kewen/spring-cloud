package com.cloud.springcloud.service.impl;

import com.cloud.springcloud.dao.StorageDao;
import com.cloud.springcloud.entity.Storage;
import com.cloud.springcloud.service.StorageService;
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
public class StorageServiceImpl implements StorageService {
    @Autowired
    private StorageDao dao;

    @Override
    public int updateOne(Storage storage) {
        return dao.updateOne(storage);
    }
}
