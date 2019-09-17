package com.springboot.com.springboot.models;

import javax.persistence.*;

@Entity
@Table(name="admin")
public class Admin {

    @Id
    @GeneratedValue

    private int id;
    @Column
    private String adminName;
    @Column
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Admin getAdminDto(){
        Admin adminDto = new Admin();
        adminDto.setAdminName(adminName);
        adminDto.setPassword(password);
        return adminDto;

    }
}
