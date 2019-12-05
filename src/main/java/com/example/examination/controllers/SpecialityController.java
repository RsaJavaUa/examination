package com.example.examination.controllers;

import com.example.examination.dto.ExamDto;
import com.example.examination.dto.UserDto;
import com.example.examination.dto.mapper.Mapper;
import com.example.examination.entity.Exam;
import com.example.examination.entity.User;
import com.example.examination.servises.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/university")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class SpecialityController {

    private final UserService userService;
    private final Mapper <Exam, ExamDto> mapper;

    private String loginPage(){
        return "speciality";
    }
}
