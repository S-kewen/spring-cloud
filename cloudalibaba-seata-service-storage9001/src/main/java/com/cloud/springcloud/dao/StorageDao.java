package com.cloud.springcloud.dao;

import com.cloud.springcloud.entity.Order;
import com.cloud.springcloud.entity.Storage;
import org.apache.ibatis.annotations.Mapper;

/**
 * @PackageName: com.cloud.springcloud.dao
 * @ClassName: StorageDao
 * @Description: This is StorageDao interface by Skwen.
 * @Author: Skwen
 * @Date: 2021-03-20 21:53
 */
@Mapper
public interface StorageDao {
    int updateOne(Storage storage);
}
