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
@Table(name = "categories")
@NoArgsConstructor
@AllArgsConstructor
public class Categories {

	@Id
	@Column(name = "ct_Id")
	private int ctId;
	
	@Column(name = "ct_Name")
    private String ctName;
	
	@Column(name = "sc_Id")
    private int scId;
	
	@Column(name = "sbc_Id")
    private int sbcId;
	
	@Column(name = "parent_Id")
    private int parentId;
	

	
    public int getId() {
    	return ctId;
    }
    
    public String getName() {
        return ctName;
    }
    
    public int getScId() {
    	return scId;
    }
    
    public int getSbcId() {
    	return sbcId;
    }
    
    public int getParentId() {
    	return parentId;
    }
    
    
    
}
