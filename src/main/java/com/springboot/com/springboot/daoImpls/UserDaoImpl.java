package com.springboot.com.springboot.daoImpls;

import com.springboot.daos.UserDao;
import com.springboot.dto.UserDto;
import com.springboot.models.User;
import com.springboot.repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private UserRepo userRepo;
    @Override
    public void WriteComment(UserDto u) {

        User user = u.getUser();
        Date date = new Date();
        user.setDate(date);
        userRepo.save(user);





    }
}
