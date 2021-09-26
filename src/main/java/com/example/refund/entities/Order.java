package com.example.refund.entities;

import java.util.Date;
import java.util.List;
import java.util.TimeZone;

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

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Date getDateOfValidity() {
        return dateOfValidity;
    }

    public void setDateOfValidity(Date dateOfValidity) {
        this.dateOfValidity = dateOfValidity;
    }

    public List<String> getSubscriptionType() {
        return subscriptionType;
    }

    public void setSubscriptionType(List<String> subscriptionType) {
        this.subscriptionType = subscriptionType;
    }
}
