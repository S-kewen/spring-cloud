package com.cloud.springcloud.result;

/**
 * @PackageName: com.boot.hellokebbi.pattern.result
 * @ClassName: StatusMsg
 * @Description: This is StatusMsg class by Skwen.
 * @Author: Skwen
 * @Date: 2020-12-13 17:41
 */
public class StatusMsg {
    public static final String OK = "success";//成功
    public static final String NOTFOUND = "the request was not found";//404
    public static final String ERROR = "request error";//失败
    public static final String FALLBACK = "fallback";//服务降级
    public static final String INSERTFAIL = "insert fail";//插入数据失败
    public static final String SELECTFAIL = "select fail";//查询数据失败
}
