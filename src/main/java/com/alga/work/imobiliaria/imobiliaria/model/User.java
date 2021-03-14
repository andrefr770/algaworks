package com.alga.work.imobiliaria.imobiliaria.model;

import org.hibernate.validator.constraints.Email;

import javax.persistence.*;

@Entity
@Table(name="user")
public class User {

    @Id
    @Column(name = "userId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;
    @Email(message="Please provide a valid email address")
    @Column(name="username", unique = true)
    private String username;
    @Column(name="password", nullable = false)
    private String password;
    @Column(name="telemovel", unique = true, nullable = false)
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
