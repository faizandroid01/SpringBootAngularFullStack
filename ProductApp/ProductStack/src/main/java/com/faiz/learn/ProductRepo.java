package com.faiz.learn;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "productdata", path = "productdata")
public interface ProductRepo extends MongoRepository<Product, Integer> {

}
