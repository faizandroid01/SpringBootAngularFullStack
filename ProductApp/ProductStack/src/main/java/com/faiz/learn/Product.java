package com.faiz.learn;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Product {
	@Id
	private int productId;
	private String name;
	private String code;
	private String title;
	private String description;
	private String imgUrl;
	private Double price;

	public Product(int productId, String name, String code, String title, String description, String imgUrl,
			Double price) {
		super();
		this.productId = productId;
		this.name = name;
		this.code = code;
		this.title = title;
		this.description = description;
		this.imgUrl = imgUrl;
		this.price = price;
	}

	public Product() {
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

}