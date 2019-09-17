package com.springboot.com.springboot.dto;

import com.springboot.models.Admin;

public class AdminDto {

    private int id;
    private String adminName;
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

    public Admin getadmin(){
        Admin admin = new Admin();
        admin.setAdminName(adminName);
        admin.setPassword(password);
        return admin;

    }

}
