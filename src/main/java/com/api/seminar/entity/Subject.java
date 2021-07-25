package com.api.seminar.entity;

import lombok.Data;

import java.util.List;

@Data
public class Subject {

    private Integer id;

    private String name;

    private Integer parent;

    private List<Subject> children;
}
