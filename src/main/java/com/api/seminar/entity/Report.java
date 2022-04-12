package com.api.seminar.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Report {

    private Integer id;

    private String title;

    private String speaker;

    private String time;

    private String location;

    private String introduction;

    private Integer view;

    private Integer cid;

    private Integer sid;

    private Date createTime;

    private Date updateTime;
}
