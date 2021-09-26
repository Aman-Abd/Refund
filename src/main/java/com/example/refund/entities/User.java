package com.example.refund.entities;

import java.util.Date;

public class User {
    private int Id;
    private String name;
    private String passord;
    private int money;
    private String phoneNumber;
    private String birthday ;

    public User(int id, String name, int money, String phoneNumber, String birthday) {
        Id = id;
        this.name = name;
        this.money = money;
        this.phoneNumber = phoneNumber;
        this.birthday = birthday;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getPassord() {
        return passord;
    }

    public void setPassord(String passord) {
        this.passord = passord;
    }
}
