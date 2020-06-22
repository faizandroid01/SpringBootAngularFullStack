package com.faiz.learn;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InitializationComponent {

	@Autowired
	private ProductRepo productRepo;

	@PostConstruct
	private void init() {

		productRepo.deleteAll();

		Product product = new Product();
		product.setName("Kamsung D3");
		product.setCode("KAMSUNG-TRIOS");
		product.setTitle("Kamsung Trios 12 inch ");
		product.setDescription("Kamsung Trios 12 Touch");
		product.setImgUrl("kamsung.jpg");
		product.setPrice(12000.00);
		productRepo.save(product);

	
	}

}
