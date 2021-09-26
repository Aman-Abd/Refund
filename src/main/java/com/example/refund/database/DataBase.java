package com.example.refund.database;

import com.example.refund.entities.Order;
import com.example.refund.entities.Payment;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
    static private DataBase dataBase;

    private List<Order> orders = new ArrayList<Order>();
    private List<Payment> payments = new ArrayList<Payment>();


    private DataBase() {
    }

    static public DataBase getDataBase(){
        if (dataBase == null)
            dataBase = new DataBase();
        return dataBase;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public List<Payment> getPayments() {
        return payments;
    }
}
