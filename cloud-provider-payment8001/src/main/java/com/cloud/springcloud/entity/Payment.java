package com.cloud.springcloud.entity;

import jdk.jfr.DataAmount;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @PackageName: com.cloud.springcloud.entity
 * @ClassName: Payment
 * @Description: This is Payment class by Skwen.
 * @Author: Skwen
 * @Date: 2021-02-24 22:00
 */
@Data
public class Payment implements Serializable {
    private Long id;
    private String serial;
    private Date add_time;
}
