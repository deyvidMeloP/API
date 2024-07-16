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
@Table(name = "section")
@NoArgsConstructor
@AllArgsConstructor
public class Section {

	
	@Id
	@Column(name = "sc_Id")
	private int scId;
	
	@Column(name = "sc_Name")
    private String scName;

	@Column(name = "sc_Url")
    private String scUrl;

	
    public int getId() {
    	return scId;
    }
    
    public String getName() {
        return scName;
    }
    
    public String getUrl() {
        return scUrl;
    }
    
   
    
}
