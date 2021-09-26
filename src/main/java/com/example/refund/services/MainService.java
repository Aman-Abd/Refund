package com.example.refund.services;

import com.example.refund.entities.Order;
import com.example.refund.entities.User;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MainService {
    private final RestTemplate restTemplate;

    public MainService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    public User getUserInfo(int id){
        String url = "http://localhost:8084/users/" + id;
        return this.restTemplate.getForObject(url, User.class);
    }

    public void updateUser(int id, User user){
        String url = "http://localhost:8084/users/update/" + user.getId();
        this.restTemplate.postForObject(url, user, String.class);
    }

    public Order GetOrderInfo(int id){
        String url = "http://localhost:8085/orders/" + id;
        return this.restTemplate.getForObject(url, Order.class);
    }
}
