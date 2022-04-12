package com.api.seminar.entity;


import lombok.Data;

import java.util.Date;

@Data
public class City {

    private Integer id;

    private String name;

    private Date createTime;

    private Date updateTime;
}
