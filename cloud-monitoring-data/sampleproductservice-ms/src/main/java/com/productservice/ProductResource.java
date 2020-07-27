package com.productservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductResource {
	
	@Autowired
	private ProductDaoService productDaoService;
	
	@GetMapping(value = "/products/findAllProducts")
	private List<Product> findAllProducts(){
		return productDaoService.findAll();
	}	

}
