package com.handson.microservicesjava.repository;

import com.handson.microservicesjava.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
