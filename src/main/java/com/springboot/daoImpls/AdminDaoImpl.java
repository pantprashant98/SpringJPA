package com.springboot.daoImpls;

import com.springboot.daos.AdminDao;
import com.springboot.dto.UserDto;
import com.springboot.models.Admin;
import com.springboot.models.User;
import com.springboot.repos.AdminRepo;
import com.springboot.repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Repository
//@ComponentScan(basePackages = "com.springboot")
public class AdminDaoImpl implements AdminDao {

    @Autowired
    private AdminRepo adminRepo;
    @Autowired
    private UserRepo userRepo;

    @Override
    @Transactional
    public boolean login(String an, String psw) {
        Admin admin = adminRepo.findByAdminNameAndPassword(an, psw);
        return admin != null;
    }


    private List<UserDto> getUser(List<User> users) {

        List<UserDto> userDtoList = new ArrayList<>();
        for
                (User u : users)

        {

       userDtoList.add(u.getUserDto());

        }
        return userDtoList;
    }

    @Override
    @Transactional
    public List<UserDto> getAllUser() {


            return getUser(userRepo.findAll());
    }

    @Override
    @Transactional
    public void deleteUser(int id) {
        userRepo.delete(id);

    }

    @Override
    @Transactional
    public void updateUser(UserDto u) {
        User user = userRepo.getOne(u.getId());

        Date date = new Date();
        user.setDate(date);
        user.setComment(u.getComment());
         userRepo.save(user);

    }


    @Override
    @Transactional
    public User getById(int id) {


        return userRepo.findOne(id);
    }

}
