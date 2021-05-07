package com.api.seminar.dao;

import com.api.seminar.entity.Report;

import java.util.List;

public interface ReportMapper {

    List<Report> listReport();

    int insertReport(Report report);

}
