package com.api.seminar.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class Report {

    private Integer id;

    private String title;

    private String speaker;

    private String location;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone = "UTC+8")
    private Date time;

    private Integer cid;

    private Integer sid;
}
