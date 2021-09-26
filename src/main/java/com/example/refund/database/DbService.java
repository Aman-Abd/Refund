package com.example.refund.database;

import com.example.refund.entities.Order;
import com.example.refund.entities.Payment;

import java.util.List;

public class DbService {
    private DataBase dataBase = DataBase.getDataBase();

    public boolean addOrder(Order order){
        try{
            dataBase.getOrders().add(order);
            return true;
        }catch (Exception exception){
            return false;
        }
    }

    public boolean addPayment(Payment payment){
        try{
            dataBase.getPayments().add(payment);
            return true;
        }catch (Exception exception){
            return false;
        }
    }

    public List<Order> getOrders(){
        return dataBase.getOrders();
    }

    public List<Payment> getPayments(){
        return dataBase.getPayments();
    }

    public Order getOrderById(int id){
        return dataBase.getOrders().stream().filter(order -> order.getId() == id).findFirst().orElseThrow();
    }

    public Payment getPaymentById(int id){
        return dataBase.getPayments().stream().filter(payment -> payment.getId() == id).findFirst().orElseThrow();
    }

    public boolean deleteOrder(int id){
        try {
            dataBase.getOrders().remove(getOrderById(id));
            return true;
        }catch (Exception exception){
            return false;
        }
    }

    public boolean deletePayment(int id){
        try {
            dataBase.getPayments().remove(getPaymentById(id));
            return true;
        }catch (Exception exception){
            return false;
        }
    }
}
