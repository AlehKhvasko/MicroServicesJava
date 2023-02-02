package com.handson.microservicesjava.service;

import com.handson.microservicesjava.dto.ProductRequest;
import com.handson.microservicesjava.model.Product;
import com.handson.microservicesjava.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {
    private final ProductRepository productRepository;

    public void createProduct(ProductRequest productRequest){
        Product product = Product.builder()
                .name(productRequest.getName())
                .description(productRequest.getDescription())
                .price(productRequest.getPrice())
                .build();

        productRepository.save(product);
        log.info("Product {} {} is saved ", product.getId(), product.getName());
    }
}
