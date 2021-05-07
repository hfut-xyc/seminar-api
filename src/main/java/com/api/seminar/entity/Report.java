package com.api.seminar.entity;

import lombok.Data;

@Data
public class Report {

    private Integer id;

    private String title;

    private String speaker;

    private String location;

    private String time;

    private Integer cid;

    private Integer sid;
}
