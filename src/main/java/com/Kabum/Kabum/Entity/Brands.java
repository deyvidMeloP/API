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
@Table(name = "brands")
@NoArgsConstructor
@AllArgsConstructor
public class Brands {

	@Id
	@Column(name = "br_Id")
	private int br_id;
	
	@Column(name = "br_Name")
	private String br_name;
	
	@Column(name = "br_ImageUrl1")
	private String br_imageurl1;
	
	@Column(name = "br_ImageUrl2")
	private String br_imageurl2;
	
	
	public int getBrId() {
		return br_id;
	}
	
	public String getBrName() {
		return br_name;
	}
	
	public String getImageUrl1() {
		return br_imageurl1;
	}
	
	public String getImageUr2() {
		return br_imageurl2;
	}
	
}
