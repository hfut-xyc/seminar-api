package com.api.seminar.dao;

import com.api.seminar.entity.Subject;

import java.util.List;

public interface SubjectMapper {

    List<Subject> listAllSubject();

    List<Subject> listSecondarySubject();

}
