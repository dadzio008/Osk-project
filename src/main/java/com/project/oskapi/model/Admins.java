package com.project.oskapi.model;

import javax.persistence.*;

@Entity
public class Admins {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(unique = true)
    private String userName;
    private String password;
    private String surName;
    private String lastName;
    private String dateofBirth;
    private String roles;

    public Admins(Long id, String userName, String password, String surName, String lastName, String dateofBirth, String roles) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.surName = surName;
        this.lastName = lastName;
        this.dateofBirth = dateofBirth;
    }

    public Admins() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateofBirth() {
        return dateofBirth;
    }

    public void setDateofBirth(String dateofBirth) {
        this.dateofBirth = dateofBirth;
    }

    public String getRoles() {
        return roles;
    }
    public void setRoles(String roles) {
        this.roles = roles;
    }
}