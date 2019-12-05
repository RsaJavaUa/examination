package com.example.examination.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@Table(name = "speciality")
@Accessors(chain = true)
public class Speciality extends BaseEntity {

    @Column(name = "name")
    private String name;

    @OneToMany (mappedBy = "speciality", cascade = CascadeType.ALL)
    private Set<Exam> exams = new HashSet<>();

    @OneToMany (mappedBy = "speciality", cascade = CascadeType.ALL)
    private Set <User> students = new HashSet<>();
}
