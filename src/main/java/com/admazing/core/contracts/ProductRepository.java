package com.admazing.core.contracts;

import com.admazing.ProductModel;

public interface ProductRepository {
	
	ProductModel findById(String idProduct);
}
