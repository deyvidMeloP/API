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
@Table(name = "subsection")
@NoArgsConstructor
@AllArgsConstructor

public class Subsection{

	@Id
	@Column(name = "sbc_Id")
	private int sbcId;
	
	@Column(name = "sbc_Name")
    private String sbcName;
	
	@Column(name = "sc_Id")
    private int scId;
	
	@Column(name = "parent_Id")
    private int parentId;
	

	
    public int getId() {
    	return sbcId;
    }
    
    public String getName() {
        return sbcName;
    }
    
    public int getScId() {
    	return scId;
    }
    
    public int getParentId() {
    	return parentId;
    }
    
    
    
    
    
}
