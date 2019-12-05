package com.example.examination.dto;

import com.example.examination.entity.BaseEntity;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class ExamDto extends BaseEntity {

    private Long id;
    private String name;
    private SpecialityDto speciality;
    private Long dateExam;
}

