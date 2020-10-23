package com.cycleworld.Model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;


@Entity
@Table(name = "UserDetails")
public class UserDetails {
    @Id
    @Column(name = "uid")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "customer_Name")
    private String userName;

    @Column(name = "passworld")
    private String passworld;

    @Column(name = "gmailId")
    private String gmailId;

    @Column(name = "mobile_Number")
    private String mobileNumber;

    @Column(name = "customer_address")
    private String address;


    public UserDetails() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassworld() {
        return passworld;
    }

    public void setPassworld(String passworld) {
        this.passworld = passworld;
    }

    public String getGmailId() {
        return gmailId;
    }

    public void setGmailId(String gmailId) {
        this.gmailId = gmailId;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    @Override
    public String toString() {
        return "UserDetails{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", passworld='" + passworld + '\'' +
                ", gmailId='" + gmailId + '\'' +
                ", mobileNumber=" + mobileNumber +
                ", address='" + address + '\'' +
                '}';
    }
}
