package com.productservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class ProductDaoService {

	private static List<Product> products	 = new ArrayList<>();
	
	static {
		products.add(new Product(101, "Apple"));
		products.add(new Product(102, "Samsung"));
		products.add(new Product(103, "Karbon"));
		products.add(new Product(104, "Nokia"));
		products.add(new Product(105, "OnePlus"));
	}
	
	public  List<Product> findAll(){
		return products;
	}
	
	public  Product findOne(int id){
		for (Product product: products) {
			if (product.getProductId()==id) {
				return product;
			}
		}
		return null;
	}
	
	public Product save(Product product) {
		
		/*
		 * if(product.getProductId() = null) { product.setProductId(++ productsCount); }
		 */
		 
		products.add(product);
		return product;
	}
	
}
