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
@Table(name = "product")
@NoArgsConstructor
@AllArgsConstructor

public class Product {

	@Id
	@Column(name = "id_product")
	private int id_Product;
	
	@Column(name = "name_product")
    private String name_Product;

    @Column(name = "price")
    private Double price;

    @Column(name = "stock_quantity")
    private Integer stock_Quantity;
    
    @Column(name = "discount")
    private Double discount;
    
    @Column(name = "maker")
    private String maker;
    
    @Column(name = "delivery")
    private String delivery;
    
    @Column(name = "imageUrl")
    private String imageUrl;
    
    @Column(name = "visits_product")
    private int visits;
    
    @Column(name = "sc_id")
    private int scId;
    
    @Column(name = "sbc_id")
    private int sbcId;
    
    
    public int getIdProduct() {
    	return id_Product;
    }
    
    public String getName_Product() {
        return name_Product;
    }
    
    public Double getPrice() {
        return price;
    }
    
    public Integer getStock_Quantity() {
        return stock_Quantity;
    }

    public Double getDiscount() {
        return discount;
    }
    
    public String getMaker() {
        return maker;
    }
    
    public String getDelivery() {
        return delivery;
    }
    
    public String getImageUrl() {
        return imageUrl;
    }
    
    public int getVisits() {
        return visits;   
    }
    
    public int getScId() {
    	return scId;
    }
    
    public int getSbcId() {
    	return sbcId;
    }
}
