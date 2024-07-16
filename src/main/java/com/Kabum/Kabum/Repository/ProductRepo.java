package com.Kabum.Kabum.Repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.Kabum.Kabum.Entity.Product;


public interface ProductRepo extends JpaRepository<Product, Integer>{

	@Modifying
    @Query("UPDATE Product p SET p.visits = :visits WHERE p.id_Product = :id")
    void updateVisits(@Param("id") int id, @Param("visits") int visits);
	 
}
