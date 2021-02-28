package com.cloud.springcloud.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
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
    private Long uid;
    private String serial;
//    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date add_time;
}
