package com.ms.domain;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.extern.java.Log;

@Data
@TableName("t_order ")
public class Order {

    @TableId(type = IdType.AUTO)
    private Long id;

    private Long uid;

    private String username;

    private Long pid;

    private String productName;

    private Double productPrice;

    private Integer number;
}
