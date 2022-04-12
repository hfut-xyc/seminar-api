package com.api.seminar.controller;

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
    public List<Report> findReport(
            @RequestParam(value = "cid", required = false) Integer cid,
            @RequestParam(value = "sid", required = false) Integer sid) {
        return reportService.findByCidAndSid(cid, sid);
    }

    @GetMapping("/hello")
    public String hello() {
        return "HelloWorld";
    }

}

