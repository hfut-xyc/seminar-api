package com.api.seminar.service;

import com.api.seminar.dao.ReportMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ReportService {

    @Resource
    private ReportMapper reportMapper;


}
