package com.api.seminar.service;

import com.api.seminar.dao.ReportMapper;
import com.api.seminar.entity.Report;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ReportService {

    @Resource
    private ReportMapper reportMapper;

    public List<Report> listReport(Integer cid, Integer sid) {
        return reportMapper.listReport(cid, sid);
    }
}
