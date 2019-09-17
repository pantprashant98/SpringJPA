package com.springboot.com.springboot.daos;

import com.springboot.dto.UserDto;
import com.springboot.models.User;

import java.util.List;

public interface AdminDao {
    public boolean login(String an, String psw);
    public User getById(int id);
    public List<UserDto> getAllUser();
    public void deleteUser(int id);
    public void updateUser(UserDto u);

   // public List<User> getUserList();
 //   public User findAllBy(int id);



}
