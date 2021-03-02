package com.cloud.springcloud.controller;

import com.cloud.springcloud.result.Result;
import com.cloud.springcloud.result.StatusCode;
import com.cloud.springcloud.result.StatusMsg;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @PackageName: com.cloud.springcloud.controller
 * @ClassName: ConfigClientController
 * @Description: This is ConfigClientController class by Skwen.
 * @Author: Skwen
 * @Date: 2021-03-03 1:21
 */
@RestController
@RefreshScope
public class ConfigClientController {
    @Value("${config.info}")
    private String configInfo;

    @RequestMapping("/getConfigInfo")
    public Result getConfigInfo() {
        return new Result(StatusCode.OK, StatusMsg.OK, configInfo);
    }
}
