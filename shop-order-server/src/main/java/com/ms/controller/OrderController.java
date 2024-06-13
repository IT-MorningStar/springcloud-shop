package com.ms.controller;

import com.ms.domain.Order;
import com.ms.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {


    @Autowired
    private OrderService orderService;


    @GetMapping("/{id}")
    public Order findByid(@PathVariable Long id){
         return orderService.getById(id);
    }

    @GetMapping("/list")
    public List<Order> list(){
        return orderService.list();
    }

    @GetMapping("/create")
    public Order createOrder(){
        try {
            return orderService.createOrder(1l,1l);
        }catch (InterruptedException interruptedException){
            return null;
        }
    }




}
