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
@Table(name = "product_category")
@NoArgsConstructor
@AllArgsConstructor
public class ProductCategory {

	@Id
	@Column(name = "pc_id")
	private int pcId;
	
	@Column(name = "id_product")
    private int idProduct;
	
	@Column(name = "ct_id")
    private int ctId;
	
	
    public int getPcId() {
    	return pcId;
    }
    
	
    public int getIdProduct() {
    	return idProduct;
    }
    
	
    public int getctId() {
    	return ctId;
    }
    
	
}
