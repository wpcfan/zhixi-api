package com.twigcodes.subject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wangpeng on 2017/3/3.
 */
@Service
public class SubjectServiceMongoImpl implements SubjectService {

    private SubjectRepository repository;

    @Autowired
    public SubjectServiceMongoImpl(SubjectRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Subject> findAll() {
        return repository.findAll();
    }

    @Override
    public Subject findById(String id) {
        return repository.findOne(id);
    }

    @Override
    public Subject addSubject(Subject subject) {
        return repository.insert(subject);
    }

    @Override
    public Subject updateSubject(Subject subject) {
        return repository.save(subject);
    }

    @Override
    public Subject enableSubject(Subject subject) {
        subject.setEnabled(true);
        return repository.save(subject);
    }

    @Override
    public Subject disableSubject(Subject subject) {
        subject.setEnabled(false);
        return repository.save(subject);
    }
}
