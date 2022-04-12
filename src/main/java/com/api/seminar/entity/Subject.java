package com.api.seminar.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Subject {

    private Integer id;

    private String name;

    private Date createTime;

    private Date updateTime;
}
