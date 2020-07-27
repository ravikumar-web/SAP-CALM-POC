package com.productservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	
	@Autowired
	private ProductDaoService productDaoService;
	
	/*get all the products*/
	@GetMapping(value = "/products")
	private List<Product> findAllProducts(){
		return productDaoService.findAll();
	}
	
	/*get the product based on the product id*/
	@GetMapping(value = "/products/{id}")
	private Product retrieveProduct(@PathVariable int id){
		return productDaoService.findOne(id);
	}

}
