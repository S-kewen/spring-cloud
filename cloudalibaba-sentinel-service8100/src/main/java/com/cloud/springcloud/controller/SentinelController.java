package com.cloud.springcloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.cloud.springcloud.result.Result;
import com.cloud.springcloud.result.StatusCode;
import com.cloud.springcloud.result.StatusMsg;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @PackageName: com.cloud.springcloud.controller
 * @ClassName: SentinelController
 * @Description: This is SentinelController class by Skwen.
 * @Author: Skwen
 * @Date: 2021-03-19 22:04
 */
@RestController
@RequestMapping("/sentinel")
public class SentinelController {
    @RequestMapping("test")
    public Result test() {
        return new Result(StatusCode.OK, StatusMsg.OK);
    }

    @RequestMapping("test2")
    public Result test2() {
        return new Result(StatusCode.OK, StatusMsg.OK);
    }

    @RequestMapping("hotKey")
    @SentinelResource(value = "hotKey", blockHandler = "deal_hotKey")
    public Result hotKey(String p1, String p2) {
        return new Result(StatusCode.OK, StatusMsg.OK);
    }

    public Result deal_hotKey(String p1, String p2, BlockException e) {
        return new Result(StatusCode.FALLBACK, StatusMsg.FALLBACK);
    }
}
