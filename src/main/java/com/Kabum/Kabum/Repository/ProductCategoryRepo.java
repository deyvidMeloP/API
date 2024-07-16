package com.Kabum.Kabum.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Kabum.Kabum.Entity.ProductCategory;

public interface ProductCategoryRepo extends JpaRepository<ProductCategory, Integer> {

	
}
