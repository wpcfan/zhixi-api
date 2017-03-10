package com.twigcodes.subject;

import java.util.List;

public interface SubjectService {
    List<Subject> findAll();
    Subject findById(String id);
    Subject addSubject(Subject subject);
    Subject updateSubject(Subject subject);
    Subject enableSubject(Subject subject);
    Subject disableSubject(Subject subject);
}
