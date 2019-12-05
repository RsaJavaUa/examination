package com.example.examination.controllers;

import com.example.examination.dto.UserDto;
import com.example.examination.dto.mapper.Mapper;
import com.example.examination.entity.User;
import com.example.examination.servises.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/login")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class LoginController {

    private final UserService userService;
    private final Mapper <User, UserDto> mapper;

    private String loginPage(){
        return "login";
    }
}
