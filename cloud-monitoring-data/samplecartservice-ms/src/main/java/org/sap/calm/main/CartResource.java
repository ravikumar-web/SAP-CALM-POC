package org.sap.calm.main;


import java.util.List;

import org.sap.calm.dao.ProductDaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CartResource {
	
	@Autowired
	private ProductDaoService productDaoService;
	
	/*
	 * @DeleteMapping(value = "/products/{productId}") private void
	 * deleteProduct(@PathVariable int productId) throws ProductNotFoundException{
	 * Product product = productDaoService.deleteByProductId(productId); if (product
	 * == null) { throw new ProductNotFoundException ("productId="+productId); } }
	 * 
	 * @GetMapping(value = "/products") private List<Product> findAllProducts(){
	 * return productDaoService.findAll(); }
	 */

}
