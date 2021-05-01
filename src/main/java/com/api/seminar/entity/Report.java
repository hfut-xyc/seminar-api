package com.api.seminar.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Report {

    private Integer id;

    private String title;

    private String speaker;

    private String location;

    private Date time;

    private Integer cid;

    private Integer sid;
}
