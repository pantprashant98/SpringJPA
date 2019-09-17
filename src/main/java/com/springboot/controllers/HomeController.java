package com.springboot.controllers;

import com.springboot.dto.UserDto;
import com.springboot.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {


    @GetMapping(value = "/")
    public String home(Model model){
        model.addAttribute("userDto",new UserDto());

        return "comment";
    }
}
