package com.marmil.crud.products.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marmil.crud.products.dao.ProductRepository;
import com.marmil.crud.products.entity.Product;

@Service
public class ProductService {
	
	
	@Autowired
	private ProductRepository productRepository;

	public List<Product> findByNameOrInfo(String name, String info) {
		return productRepository.findByNamepOrInfo(name,info);
	}

	public void updateCaloriesByName(String name, int cal) {
		productRepository.updateProductCaloriesByName(name,cal);
		
	}


}
