package com.springboot.com.springboot.controllers;

import com.springboot.daos.AdminDao;
import com.springboot.dto.AdminDto;
import com.springboot.dto.UserDto;
import com.springboot.models.Admin;
import com.springboot.models.User;
import com.springboot.repos.AdminRepo;
import com.springboot.repos.UserRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class AdminController {
    private static final Logger logger = LoggerFactory.getLogger(AdminController.class);

    @Autowired
    private AdminRepo adminRepo;

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private AdminDao adminDao;

    @GetMapping(value = "/login")
    public String getlogin(Model model) {
        model.addAttribute("adminDto", new AdminDto());
        logger.info("Inside Login Page");

        return "login";
    }

    @PostMapping(value = "/login")
    public String login(@ModelAttribute("adminDto") AdminDto at, Model model,HttpSession session) {

        if (adminDao.login(at.getAdminName(), at.getPassword())) {


            logger.info("Login Successfull");
            model.addAttribute("adminName", at.getAdminName());
            model.addAttribute("userDtoList", adminDao.getAllUser());
            session.setAttribute("activeUser", at.getAdminName());




            return "list";
        }
        model.addAttribute("errors", "User Does Not Exist!!");
        return "login";
    }

    @RequestMapping(value = "/edit", method = RequestMethod.GET)
    public String editComment(@RequestParam("getId") int id, Model model) {

        model.addAttribute("userDto", adminDao.getById(id));
        logger.info("Edit User");

        return "editComment";
    }


    @PostMapping("/update")
    public String updateComment(@ModelAttribute UserDto u, Model model) {


        logger.info("Update User");

        adminDao.updateUser(u);

        model.addAttribute("userDtoList", adminDao.getAllUser());
        return "list";
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String deleteComment(@RequestParam("getId") int id, Model model) {

        logger.info("Delete User");
        adminDao.deleteUser(id);
        model.addAttribute("userDtoList", adminDao.getAllUser());
        return "list";
    }


    @GetMapping("/logout")
    public String logoutPage(HttpSession session,Model model) {
        logger.info("Log Out");
        session.invalidate();
        model.addAttribute("adminDto",new AdminDto());
        return "login";
    }

}

