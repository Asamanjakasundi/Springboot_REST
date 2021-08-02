package com.prod.Product.entity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController


public class Product 
{
	
	@GetMapping("/createProduct")
	public static String createProduct() {
		return "Prod1," + "Shirt," + "EACH";
	}
	
	@GetMapping("/sortProducts")
	public static String sortProducts() {
		return "Prod3\t" + "Tie\t" + "EACH\t" + "2021-02-04\t";
	}
	
	

	String productId;
	String productName;
	String unitOfMeasure;
	String Status;


}
