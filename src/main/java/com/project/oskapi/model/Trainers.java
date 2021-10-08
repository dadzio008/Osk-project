package com.project.oskapi.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Trainers {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    @Column(unique = true)
    String userName;
    String password;
    String surName;
    String lastName;
    String phoneNumber;
    Date dateofBirth;

    public Trainers() {

    }

    public Trainers(Long id, String userName, String password, String surName, String lastName, String phoneNumber, Date dateofBirth) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.surName = surName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.dateofBirth = dateofBirth;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getDateofBirth() {
        return dateofBirth;
    }

    public void setDateofBirth(Date dateofBirth) {
        this.dateofBirth = dateofBirth;
    }
}