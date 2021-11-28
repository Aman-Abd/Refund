package com.example.refund.entities;

public class Refund {
    private String id;
    private String amount;
    private String UserName;
    private String description;

    public Refund() {
    }

    public Refund(String id, String amount, String userName, String description) {
        this.id = id;
        this.amount = amount;
        this.UserName = userName;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Refund{" +
                "id='" + id + '\'' +
                ", amount='" + amount + '\'' +
                ", UserName='" + UserName + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
