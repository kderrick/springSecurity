package com.kyle.restws;

import java.util.List;

public interface ProductService {

	List <Product> getProducts();
	
	int addProduct(Product product);
	
}
