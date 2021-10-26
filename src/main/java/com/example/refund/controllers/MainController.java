package com.example.refund.controllers;

import com.example.refund.database.DbService;
import com.example.refund.entities.Order;
import com.example.refund.entities.User;
import com.example.refund.services.MainService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("refund")
@Api(value = "Refund Controller class", description = "This class allows to interact with Payment object")
public class MainController {

    DbService dbService = new DbService();

    @Autowired
    MainService mainService;

    @PostMapping("{id}")
    @ApiOperation(value = "Method to refund payment", response = List.class)
    @HystrixCommand(
            fallbackMethod = "refundFallBack",
            threadPoolKey = "refund",
            threadPoolProperties = {
                    @HystrixProperty(name="coreSize", value="100"),
                    @HystrixProperty(name="maxQueueSize", value="50"),
            })
    public boolean refund(@PathVariable String id){
        try{
            Order order = mainService.GetOrderInfo(Integer.parseInt(id));
            int refundAmount = order.getAmount();
            User user = mainService.getUserInfo(order.getUserId());
            user.setMoney(user.getMoney() + refundAmount);
            mainService.updateUser(user.getId(), user);
            return true;
        }catch (Exception exception){
            return false;
        }
    }

    public boolean refundFallBack(@PathVariable String id){
        return false;
    }
}
