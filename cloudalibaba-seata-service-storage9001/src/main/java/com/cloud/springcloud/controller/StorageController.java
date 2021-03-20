package com.cloud.springcloud.controller;

import com.cloud.springcloud.entity.Storage;
import com.cloud.springcloud.result.Result;
import com.cloud.springcloud.result.StatusCode;
import com.cloud.springcloud.result.StatusMsg;
import com.cloud.springcloud.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @PackageName: com.cloud.springcloud.controller
 * @ClassName: OrderController
 * @Description: This is OrderController class by Skwen.
 * @Author: Skwen
 * @Date: 2021-03-20 20:54
 */
@RestController
@RequestMapping("/storage")
public class StorageController {
    @Autowired
    private StorageService storageService;

    @RequestMapping("decrease")
    public Result decrease(Long id, int count) {
        Storage storage = new Storage();
        storage.setId(id);
        storage.setUsed(count);
        if (storageService.updateOne(storage) > 0) {
            return new Result(StatusCode.OK, StatusMsg.OK);
        }
        return new Result(StatusCode.UPDATEFAIL, StatusMsg.UPDATEFAIL);
    }
}
