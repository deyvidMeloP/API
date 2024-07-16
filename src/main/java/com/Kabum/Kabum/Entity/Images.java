package com.Kabum.Kabum.Entity;


import jakarta.persistence.Entity;

import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;



@Entity
@Data
@Table(name = "images")
@NoArgsConstructor
@AllArgsConstructor
public class Images {

	@Id
	@Column(name = "image_id")
	private int image_id;
	
	@Column(name = "product_id")
	private int product_id;
	
	@Column(name = "image_url")
	private String image_url;
	
	
	public int getImageId() {
		return image_id;
	}
	
	public int getProductId() {
		return product_id;
	}
	
	public String getImageUrl() {
		return image_url;
	}
}
