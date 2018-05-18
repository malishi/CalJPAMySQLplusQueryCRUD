package com.marmil.crud.products;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

import com.marmil.crud.products.entity.Product;
import com.marmil.crud.products.service.ProductService;

@SpringBootApplication
@EnableAsync
public class CalJpaMysqlCrudApplication implements CommandLineRunner{

	
	@Autowired
	private ProductService productService;
	
	public static void main(String[] args) {
		SpringApplication.run(CalJpaMysqlCrudApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		
		updateProductCaloriesByName();
		
		List<Product> list = productService.findByNameOrInfo("Pomelo","Fruit");
		list.forEach(System.out::println);
	}

	private void updateProductCaloriesByName() {
		String name = "Beer";
		int cal = 202;
		
		productService.updateCaloriesByName(name,cal);
	}
}
