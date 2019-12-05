package com.example.examination.dto;

import com.example.examination.entity.BaseEntity;
import com.example.examination.enums.Role;
import lombok.Data;
import lombok.experimental.Accessors;


@Data
@Accessors(chain = true)
public class UserDto extends BaseEntity {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Role role;
    private SpecialityDto speciality;
}
