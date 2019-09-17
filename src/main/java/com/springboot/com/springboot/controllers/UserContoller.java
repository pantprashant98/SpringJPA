package com.springboot.com.springboot.controllers;

import com.springboot.controllers.AdminController;
import com.springboot.daos.UserDao;
import com.springboot.dto.AdminDto;
import com.springboot.dto.UserDto;
import com.springboot.models.User;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.logging.Logger;

@Controller
public class UserContoller {
    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(AdminController.class);


    @Autowired
    private UserDao userDao;

    @GetMapping(value = "/comment")
    public String getComment(Model model) {

        logger.info("Inside Comment Page");
        model.addAttribute("userDto", new UserDto());
        return "comment";
    }

    @PostMapping( value = "/comment")
    public String comment(@Validated@ModelAttribute("userDto") UserDto u, BindingResult result, Model model) {

        if (result.hasErrors()) {
            return "comment";
        }
        logger.info("Comment Posted");
        userDao.WriteComment(u);
        model.addAttribute("adminDto", new AdminDto());
        model.addAttribute("commentSaved", "Comment successfully saved!!");

return "login";

}

}