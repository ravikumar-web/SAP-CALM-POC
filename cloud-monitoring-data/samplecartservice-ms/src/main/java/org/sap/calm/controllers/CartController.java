package org.sap.calm.controllers;


import java.util.List;

import org.sap.calm.common.ProductNotFoundException;
import org.sap.calm.dao.ProductDaoService;
import org.sap.calm.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CartController {
	
	@Autowired
	private ProductDaoService productDaoService;
	
	/*
	 * @Autowired private RestTemplate restTemplate;
	 */
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	private String test(){
		return "TEST";
	}
	
	@GetMapping(value = "/products")
	private List<Product> findAllProducts(){
		return productDaoService.findAll();
	}
	
	
	
	@PostMapping(value = "/addProduct")
	private void addProduct(@RequestBody Product product){
		productDaoService.addProduct(product);		
	}
	
	@DeleteMapping(value = "/products/{deleteByProductId}")
	private void deleteProduct(@PathVariable int deleteByProductId) throws ProductNotFoundException{
		Product product = productDaoService.deleteByProductId(deleteByProductId);
		if (product == null) {
			throw new ProductNotFoundException ("productId="+deleteByProductId);
		}
	}

}
