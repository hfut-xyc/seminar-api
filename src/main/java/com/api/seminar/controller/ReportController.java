package com.api.seminar.controller;

import com.api.seminar.dto.CommonResponse;
import com.api.seminar.entity.Report;
import com.api.seminar.service.ReportService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class ReportController {

    @Resource
    private ReportService reportService;

    @GetMapping("/report/list")
    public CommonResponse<List<Report>> listReport() {
        List<Report> reportList = reportService.listReport();
        return CommonResponse.success("刷新成功", reportList);
    }
}

