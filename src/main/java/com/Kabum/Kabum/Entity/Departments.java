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
@Table(name = "departments")
@NoArgsConstructor
@AllArgsConstructor
public class Departments {
	
	@Id
	@Column(name = "dt_id")
	private int dt_id;
	
	@Column(name = "id_product")
	private int id_product;
	
	@Column(name = "dt_name")
	private String dt_name;
	
	@Column(name = "dt_category1")
	private String dt_category1;
	
	@Column(name = "dt_category2")
	private String dt_category2;
	
	@Column(name = "dt_category3")
	private String dt_category3;
	
	
	public int getDtId() {
		return dt_id;
	}
	
	public int getProductId() {
		return id_product;
	}
	
	public String getDtName() {
		return dt_name;
	}
	
	public String getDtCategory1() {
		return dt_category1;
	}
	
	public String getDtCategory2() {
		return dt_category2;
	}
	
	public String getDtCategory3() {
		return dt_category3;
	}
	
	

}
