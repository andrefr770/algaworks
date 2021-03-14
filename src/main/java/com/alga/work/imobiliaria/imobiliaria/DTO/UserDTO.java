package com.alga.work.imobiliaria.imobiliaria.DTO;

import org.hibernate.validator.constraints.Email;

import javax.persistence.Column;

public class UserDTO {

    private String username;
    private String password;
    private String telemovel;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelemovel() {
        return telemovel;
    }

    public void setTelemovel(String telemovel) {
        this.telemovel = telemovel;
    }
}
