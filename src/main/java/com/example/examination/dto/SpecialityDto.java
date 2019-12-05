package com.example.examination.dto;

import com.example.examination.entity.BaseEntity;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.HashSet;
import java.util.Set;


@Data
@Accessors(chain = true)
public class SpecialityDto extends BaseEntity {

    private  Long id;
    private String name;
    private Set<ExamDto> exams = new HashSet<>();
    private Set <UserDto> students = new HashSet<>();
}
