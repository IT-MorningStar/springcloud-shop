package com.ms.feign;

import com.ms.domain.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "product-service",fallback = ProductFeignFallback.class)
public interface ProductFeign {

    @GetMapping("/products/{id}")
    Product getProductById(@PathVariable Long id);
}
