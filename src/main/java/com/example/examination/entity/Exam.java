package com.example.examination.entity;

import com.example.examination.enums.Mark;
import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.HashMap;
import java.util.Map;

@Data
@Entity
@Table (name = "exam")
@Accessors(chain = true)
public class Exam extends BaseEntity {

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "speciality_id")
    private Speciality speciality;

    @Column (name = "exam_date")
    private Long dateExam;

}

