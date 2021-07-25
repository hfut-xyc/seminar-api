package com.api.seminar.dao;

import com.api.seminar.entity.Report;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ReportMapper {

    List<Report> listReport(@Param("cid") Integer cid, @Param("sid") Integer sid);

    int insertReport(Report report);

}
