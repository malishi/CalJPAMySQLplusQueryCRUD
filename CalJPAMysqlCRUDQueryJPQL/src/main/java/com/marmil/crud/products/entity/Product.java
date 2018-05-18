package com.marmil.crud.products.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name="product")
@DynamicUpdate
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Product_Id")
	private Integer ProductId;
	
	@Column(name="NameP",nullable=false)
	private String namep;
	
	@Column(name="calories")
	private Integer calories;
	
	@Column(name="Carbohydrates")
	private Integer carbohydrates;
	
	@Column(name="Fat")
	private Integer fat;
	
	@Column(name="Proteins")
	private Integer proteins;
	
	@Column(name="Info")
	private String info;

	public Integer getProductId() {
		return ProductId;
	}

	public void setProductId(Integer productId) {
		ProductId = productId;
	}

	public String getNamep() {
		return namep;
	}

	public void setNamep(String namep) {
		this.namep = namep;
	}

	public Integer getCalories() {
		return calories;
	}

	public void setCalories(Integer calories) {
		this.calories = calories;
	}

	public Integer getCarbohydrates() {
		return carbohydrates;
	}

	public void setCarbohydrates(Integer carbohydrates) {
		this.carbohydrates = carbohydrates;
	}

	public Integer getFat() {
		return fat;
	}

	public void setFat(Integer fat) {
		this.fat = fat;
	}

	public Integer getProteins() {
		return proteins;
	}

	public void setProteins(Integer proteins) {
		this.proteins = proteins;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

}
