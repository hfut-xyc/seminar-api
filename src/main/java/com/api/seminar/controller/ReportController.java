package com.api.seminar.controller;

import com.api.seminar.dto.CommonResponse;
import com.api.seminar.entity.Report;
import com.api.seminar.service.ReportService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class ReportController {

    @Resource
    private ReportService reportService;

    @GetMapping("/report/list")
    public CommonResponse<List<Report>> listReport(
            @RequestParam(value = "cid", required = false) Integer cid,
            @RequestParam(value = "sid", required = false) Integer sid) {
        List<Report> reportList = reportService.listReport(cid, sid);
        return CommonResponse.success("刷新成功", reportList);
    }

}

