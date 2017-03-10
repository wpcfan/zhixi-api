package com.twigcodes.subject;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Subject {
    @Id
    private String id;
    private String label;
    private boolean enabled;
}
