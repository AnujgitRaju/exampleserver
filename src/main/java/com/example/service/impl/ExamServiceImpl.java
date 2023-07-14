package com.example.service.impl;

import com.example.payload.ExamDto;
import com.example.repository.ExamRepository;
import org.springframework.stereotype.Service;

@Service
public class ExamServiceImpl implements ExamService{

    private ExamRepository examRepository;

    public ExamServiceImpl(ExamRepository examRepository){
        this.examRepository = examRepository;
    }

    @Override
    public ExamDto createExam(ExamDto examDto) {
              return null;
    }
}
