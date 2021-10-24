package com.example.refund.entities;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;
import java.util.TimeZone;

@Getter
@Setter

public class Order {

    static int COUNTER = 0;
    private int Id;
    private int amount;
    private int userId;
    private Date dateOfValidity;
    private List<String> subscriptionType;

    public Order(int amount, int userId, Date dateOfValidity, List<String> subscriptionType) {
        this.Id = ++COUNTER;
        this.amount = amount;
        this.userId = userId;
        this.dateOfValidity = dateOfValidity;
        this.subscriptionType = subscriptionType;
    }

    public boolean isValid() {
        Date currentDate = new Date();
        TimeZone.setDefault( TimeZone.getTimeZone("UTC"));
        return dateOfValidity.after(currentDate);
    }
}
