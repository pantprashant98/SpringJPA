package com.springboot.com.springboot.dto;

import com.springboot.models.User;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Size;
import java.util.Date;

public class UserDto {


    private int id;
    @NotEmpty(message = "Username should not be empty.")
    @Size(min=2,max = 40)
    private String username;
    private Date date;
    @NotEmpty(message = "Comment should not be empty.")
    private String comment;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public User getUser(){
        User user = new User();
     user.setUsername(username);
        user.setComment(comment);
        user.setDate(date);
        return user;

    }
}
