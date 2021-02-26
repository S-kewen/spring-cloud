package com.cloud.springcloud.controller;

import com.cloud.springcloud.result.Result;
import com.cloud.springcloud.result.StatusCode;
import com.cloud.springcloud.result.StatusMsg;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @PackageName: com.cloud.springcloud.controller
 * @ClassName: ConsulController
 * @Description: This is ConsulController class by Skwen.
 * @Author: Skwen
 * @Date: 2021-02-26 21:05
 */
@RestController
@RequestMapping("/consul")
public class ConsulController {
    @RequestMapping("health")
    public Result health() {
        return new Result(StatusCode.OK, StatusMsg.OK);
    }
}
