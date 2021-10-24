package com.example.refund.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Payment {

    static private int COUNTER = 0;
    private int Id;
    private Order order;
    private boolean paid;

    public Payment(Order order, boolean paid) {
        this.Id = ++COUNTER;
        this.order = order;
        this.paid = paid;
    }
}
