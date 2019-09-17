package com.springboot.com.springboot.models;

import com.springboot.dto.UserDto;

import javax.persistence.*;

import org.hibernate.validator.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Date;
@Entity
@Table(name="user")
public class User {
    @Id
    @GeneratedValue
    private int id;
    @Column
    @NotEmpty(message = "Username should not be empty.")
    @Size(min=2,max = 40)
    private String username;
    @Column
    private Date date;
    @Column
    @NotEmpty(message = "Comment should not be empty.")
     private String comment;

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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
    @Override
    public String toString() {
        return "User{" +
                "date=" + date +
                '}';
    }
    public UserDto getUserDto(){
        UserDto userDto = new UserDto();
        userDto.setId(id);
        userDto.setUsername(username);
        userDto.setComment(comment);
        userDto.setDate(date);
        return userDto;

    }
}

