package com.api.seminar.dao;

import com.api.seminar.entity.Report;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ReportMapper {

    List<Report> findByCidAndSid(@Param("cid") Integer cid, @Param("sid") Integer sid);

    Integer save(Report report);

}
