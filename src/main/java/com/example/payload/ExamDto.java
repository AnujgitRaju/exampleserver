package com.example.payload;

import lombok.Data;

@Data
public class ExamDto {

    private long id;
    private String name;
    private String lastname;
    private String content;
    private String description;
}
