package com.example.refund.controllers;

import com.example.refund.database.DbService;
import com.example.refund.entities.Order;
import com.example.refund.entities.User;
import com.example.refund.services.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("refund")
public class MainController {

    DbService dbService = new DbService();

    @Autowired
    MainService mainService;

    @PostMapping("{id}")
    public boolean refund(@PathVariable String id){
        try{
            Order order = mainService.GetOrderInfo(Integer.parseInt(id));
            int refundAmount = order.getAmount();
            User user = mainService.getUserInfo(order.getUserId());
            user.setMoney(user.getMoney() + refundAmount);
            mainService.updateUser(user.getId(), user);
            return true;
        }catch (Exception exception){
            return true;
        }
    }
}
