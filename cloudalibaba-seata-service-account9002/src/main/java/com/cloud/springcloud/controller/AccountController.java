package com.cloud.springcloud.controller;

import com.cloud.springcloud.entity.Account;
import com.cloud.springcloud.entity.Storage;
import com.cloud.springcloud.result.Result;
import com.cloud.springcloud.result.StatusCode;
import com.cloud.springcloud.result.StatusMsg;
import com.cloud.springcloud.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * @PackageName: com.cloud.springcloud.controller
 * @ClassName: OrderController
 * @Description: This is OrderController class by Skwen.
 * @Author: Skwen
 * @Date: 2021-03-20 20:54
 */
@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @RequestMapping("pay")
    public Result pay(Long uid, BigDecimal money) {
        Account account = new Account();
        account.setId(uid);
        account.setUsed(money);
       int a = 1/0;
        //模拟异常
//        try
//        {
//            Thread.sleep(3000);    //延时2秒
//        }
//        catch(InterruptedException e)
//        {
//            e.printStackTrace();
//        }
        if (accountService.updateOne(account) > 0) {
            return new Result(StatusCode.OK, StatusMsg.OK);
        }
        return new Result(StatusCode.UPDATEFAIL, StatusMsg.UPDATEFAIL);
    }
}
