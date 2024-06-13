package com.ms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ms.domain.Order;


public interface OrderService extends IService<Order> {
    Order createOrder(Long productId, Long userId) throws InterruptedException;
}
