package com.kyle.restws;

import java.util.List;

public interface ProductService {

	List <Product> getProducts();
	
	long addProduct(Product product);
	
}
