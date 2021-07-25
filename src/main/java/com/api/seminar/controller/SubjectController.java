package com.api.seminar.controller;

import com.api.seminar.dto.CommonResponse;
import com.api.seminar.entity.Subject;
import com.api.seminar.service.SubjectService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class SubjectController {

    @Resource
    private SubjectService subjectService;

    @GetMapping("/subject/list")
    public CommonResponse<List<Subject>> listSubject(@RequestParam(defaultValue = "1", required = false) Integer type) {
        List<Subject> subjectList = subjectService.listSubject(type);
        return CommonResponse.success("刷新成功", subjectList);
    }
}

