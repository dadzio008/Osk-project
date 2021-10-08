package com.project.oskapi.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Coursants {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    @Column(unique = true)
    String userName;
    String password;
    String surName;
    String lastName;
    Date dateofbirth;
    String address;
    String phoneNumber;

    public Coursants(Long id, String userName, String password, String surName, String lastName, Date dateofbirth, String address, String phoneNumber) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.surName = surName;
        this.lastName = lastName;
        this.dateofbirth = dateofbirth;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public Coursants() {

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

    public Date getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(Date dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


}
