package com.api.seminar.dao;

import com.api.seminar.entity.Subject;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface SubjectMapper {

    @Select("select id, name from subject")
    List<Subject> findAll();

}
