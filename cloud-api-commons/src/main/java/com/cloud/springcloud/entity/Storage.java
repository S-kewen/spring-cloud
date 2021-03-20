package com.cloud.springcloud.entity;

import lombok.Data;

/**
 * @PackageName: com.cloud.springcloud.entity
 * @ClassName: Storage
 * @Description: This is Storage class by Skwen.
 * @Author: Skwen
 * @Date: 2021-03-20 20:56
 */
@Data
public class Storage {
    private Long id;
    private Long product_id;
    private int total;
    private int used;
    private int residue;

}
