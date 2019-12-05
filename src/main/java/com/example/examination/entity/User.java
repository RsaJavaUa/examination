package com.example.examination.entity;

import com.example.examination.enums.Mark;
import com.example.examination.enums.Role;
import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.HashMap;
import java.util.Map;


@Data
@Entity
@Table (name = "student")
@Accessors(chain = true)
public class User extends BaseEntity{

    @Column (name = "first_name")
    private String firstName;

    @Column (name = "last_name")
    private String lastName;

    @Column (name = "email")
    private String email;

    @Column (name = "password")
    private String password;

    @Enumerated(EnumType.STRING)
    @Column (name = "role")
    private Role role;

    @ManyToOne
    @JoinColumn (name = "speciality_id")
    private Speciality speciality;
}
