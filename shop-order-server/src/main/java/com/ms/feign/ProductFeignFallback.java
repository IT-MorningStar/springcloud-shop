package com.ms.feign;

import com.ms.domain.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductFeignFallback implements ProductFeign{
    @Override
    public Product getProductById(Long id) {
        Product product = new Product();
        product.setId(1l);
        product.setName("123");
        product.setPrice(12.2);
        return product;
    }
}
