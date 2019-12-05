package com.example.examination.servises;

import com.example.examination.entity.Exam;
import com.example.examination.repositories.ExamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ExamServise implements BaseService<Exam> {

    private final ExamRepository examRepository;

    @Override
    public List<Exam> getAll() {
        return null;
    }

    @Override
    public Exam getByName(String name) {
        return null;
    }

    @Override
    public Exam getById(Long id) {
        return null;
    }

    @Override
    public void save(Exam user) {

    }
}
