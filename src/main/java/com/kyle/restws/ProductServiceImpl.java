package com.kyle.restws;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements ProductService {
	
	private List<Product> products = new ArrayList<>();
	private long id = 123;
	
	ProductServiceImpl() {
		Product product = new Product();
		product.setId(++id);
		product.setDescription("Test Product Description");
		products.add(product);
	}

	@Override
	public List<Product> getProducts() {
		return products;
	}

	@Override
	public long addProduct(Product product) {
		product.setId(++id);
		products.add(product);
		
		return product.getId();
	}

}
