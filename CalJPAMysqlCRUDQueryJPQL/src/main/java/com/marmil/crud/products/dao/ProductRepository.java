package com.marmil.crud.products.dao;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.scheduling.annotation.Async;
import org.springframework.transaction.annotation.Transactional;

import com.marmil.crud.products.entity.Product;

public interface ProductRepository extends CrudRepository<Product,Integer> {

	@Query("SELECT p FROM Product p WHERE p.namep=:name Or p.info=:info")
	List<Product> findByNamepOrInfo(@Param("name")String namep,@Param("info")String info);
	
	@Transactional
	@Modifying(clearAutomatically=true)
	@Query(value="UPDATE Product set calories=:cal WHERE namep=:name")
	void updateProductCaloriesByName(@Param("name")String namep,@Param("cal") int calories);
}
