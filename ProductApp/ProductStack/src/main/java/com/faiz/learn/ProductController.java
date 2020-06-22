package com.faiz.learn;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

	@Autowired
	private ProductRepo productRepo;

	@GetMapping("/products")
	@CrossOrigin(origins = "http://localhost:4200")
    public List<Product> getAllProducts(){
        return productRepo.findAll();
    }
	
}
