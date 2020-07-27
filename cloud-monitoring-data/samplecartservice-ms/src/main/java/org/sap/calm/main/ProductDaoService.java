package org.sap.calm.main;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.sap.calm.model.Product;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;


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
	
	public  Product deleteByProductId(int id){
		Iterator<Product> iterator  = products.iterator();
		while (iterator.hasNext()) {
			Product product = iterator.next();
			if(product.getProductId() == id) {
				iterator.remove();
				return product; 
			}
		}
		return null;
		
	}
	
	public  List<Product> findAll(){
		return products;
	}
	
	public  Product addProduct(Product product){
		products.add(product);
		return product;
		
	}
}
