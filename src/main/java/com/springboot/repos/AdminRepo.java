package com.springboot.repos;

import com.springboot.dto.UserDto;
import com.springboot.models.Admin;
import com.springboot.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdminRepo extends JpaRepository<Admin,Integer> {
    Admin findByAdminNameAndPassword(String an,String psw);

}
