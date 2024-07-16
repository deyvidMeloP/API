package com.Kabum.Kabum.Controller;

import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;


import com.Kabum.Kabum.Service.ProductService;
import com.Kabum.Kabum.Entity.Product;
import com.Kabum.Kabum.Entity.Images;
import com.Kabum.Kabum.Entity.Brands;
import com.Kabum.Kabum.Entity.Departments;
import com.Kabum.Kabum.Entity.Section;
import com.Kabum.Kabum.Entity.Subsection;
import com.Kabum.Kabum.Entity.Categories;
import com.Kabum.Kabum.Entity.ProductCategory;

import java.util.List;



/*netstat -ano | findstr :8080*/
@RestController
@CrossOrigin(origins = "https://deyvidmelop.github.io") 
public class ProductController {

	@Autowired
	private ProductService productService;
	
	/*@PostMapping("/addProduct")
	public Product postDetails(@RequestBody Product product) {
	
		return productService.saveDetails(product);
	
	}*/
	
    @GetMapping("/api/products")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }
    
    @GetMapping("/api/images")
    public List<Images> getAllImages(){
    	return productService.getAllImages();
    }
    
    @GetMapping("/api/brands")
    public List<Brands> getAllBrands(){
    	return productService.getAllBrands();
    }
    
    @GetMapping("/api/departments")
    public List<Departments> getAllDepartments(){
    	return productService.getAllDepartments();
    }
    
    @GetMapping("/api/section")
    public List<Section> getAllSection(){
    	return productService.getAllSection();
    }
    
    @GetMapping("/api/subsection")
    public List<Subsection> getAllSubsection(){
    	return productService.getAllSubsection();
    }
    
    @GetMapping("/api/categories")
    public List<Categories> getAllCategories(){
    	return productService.getAllCategories();
    }
    
    @GetMapping("/api/productCategory")
    public List<ProductCategory> getAllProductCategory(){
    	return productService.getAllProductCategory();
    }
    
    @PutMapping("/api/products/{id}/visits")
    public void updateProductVisits(@PathVariable("id") int id, @RequestBody Map<String, Integer> payload) {
        if (payload.containsKey("visits")) {
            int visits = payload.get("visits");
            productService.updateProductVisits(id, visits);
        } else {
            throw new IllegalArgumentException("Key 'visits' is missing in the request body");
        }
    }
}
