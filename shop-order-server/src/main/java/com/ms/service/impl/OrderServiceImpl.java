package com.ms.service.impl;

import com.alibaba.nacos.shaded.org.checkerframework.checker.units.qual.A;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ms.domain.Order;
import com.ms.domain.Product;
import com.ms.feign.ProductFeign;
import com.ms.mapper.OrderMapper;
import com.ms.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

    @Autowired
    private RestTemplate restTemplate;


    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private ProductFeign productFeign;

    @Override
    public Order createOrder(Long productId, Long userId) throws InterruptedException {

//        List<ServiceInstance> listInstance =  discoveryClient.getInstances("product-service");
//        ServiceInstance instance = listInstance.get(0);
//        String url = "http://product-service/products/1";
//        Product product = restTemplate.getForObject(url, Product.class);

        Product product = productFeign.getProductById(1l);


        System.out.println(product);



        return null;
    }

}
