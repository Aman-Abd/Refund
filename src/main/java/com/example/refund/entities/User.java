package com.example.refund.entities;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter

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
}
