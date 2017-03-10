package com.twigcodes.subject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("subjects")
public class SubjectController {
    private SubjectService service;
    @Autowired
    public SubjectController(SubjectService service) {
        this.service = service;
    }
}
