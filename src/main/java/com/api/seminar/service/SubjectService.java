package com.api.seminar.service;

import com.api.seminar.dao.SubjectMapper;
import com.api.seminar.entity.Subject;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SubjectService {

    @Resource
    private SubjectMapper subjectMapper;

    public List<Subject> listSubject() {
        return subjectMapper.listSubject();
    }
}
