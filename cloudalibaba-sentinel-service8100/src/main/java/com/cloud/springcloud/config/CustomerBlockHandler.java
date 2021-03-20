package com.cloud.springcloud.config;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.cloud.springcloud.result.Result;
import com.cloud.springcloud.result.StatusCode;
import com.cloud.springcloud.result.StatusMsg;

/**
 * @PackageName: com.cloud.springcloud.config
 * @ClassName: CustomerBlockHandler
 * @Description: This is CustomerBlockHandler class by Skwen.
 * @Author: Skwen
 * @Date: 2021-03-20 18:50
 */
public class CustomerBlockHandler {
    //注意参数是否与controller中参数一致!
    public static Result fallback(BlockException e) {
        return new Result(StatusCode.FALLBACK, StatusMsg.FALLBACK);
    }
    public static Result flowLimit(BlockException e) {
        return new Result(StatusCode.FLOWLIMIT, StatusMsg.FLOWLIMIT);
    }
}
