package com.springboot.com.springboot.repos;


import com.springboot.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends JpaRepository<User,Integer> {

//    List<User> findAll();
//    User findById(int id);
}
