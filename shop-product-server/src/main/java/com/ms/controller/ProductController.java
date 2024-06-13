package com.ms.controller;

import com.ms.domain.Product;
import com.ms.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {


    @Autowired
    private ProductService productService;


    @GetMapping("/{id}")
    public Product findByid(@PathVariable Long id){
         return productService.getById(id);
    }

    @GetMapping("/list")
    public List<Product> list(){
        return productService.list();
    }

}
