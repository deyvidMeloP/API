package com.Kabum.Kabum.Service;

import org.springframework.stereotype.Service;

import com.Kabum.Kabum.Entity.Brands;
import com.Kabum.Kabum.Entity.Product;
import com.Kabum.Kabum.Entity.Departments;
import com.Kabum.Kabum.Entity.Section;
import com.Kabum.Kabum.Entity.Subsection;
import com.Kabum.Kabum.Entity.Categories;
import com.Kabum.Kabum.Repository.ProductRepo;
import com.Kabum.Kabum.Repository.BrandsRepo;
import com.Kabum.Kabum.Repository.DepartmentsRepo;
import com.Kabum.Kabum.Repository.SectionRepo;
import com.Kabum.Kabum.Repository.SubsectionRepo;
import com.Kabum.Kabum.Repository.CategoriesRepo;
import com.Kabum.Kabum.Repository.ProductCategoryRepo;
import com.Kabum.Kabum.Entity.Images;
import com.Kabum.Kabum.Entity.ProductCategory;
import com.Kabum.Kabum.Repository.ImagesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;



@Service
public class ProductService {

    @Autowired
    private ProductRepo productRepo;
    @Autowired 
    private ImagesRepo imagesRepo;
    
    @Autowired 
    private BrandsRepo brandsRepo;
    
    @Autowired 
    private DepartmentsRepo departmentsRepo;
    
    @Autowired 
    private SectionRepo sectionRepo;
    
    @Autowired 
    private SubsectionRepo subsectionRepo;

    @Autowired 
    private CategoriesRepo categoriesRepo;
    
    @Autowired 
    private ProductCategoryRepo productCategoryRepo;
    
    
    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }

    public List<Images> getAllImages(){
    	return imagesRepo.findAll();
    }
    
    public List<Brands> getAllBrands(){
    	return brandsRepo.findAll();
    }
    
    public List<Departments> getAllDepartments(){
    	
    	return departmentsRepo.findAll();
    }
    
    public List<Section> getAllSection(){
    	
    	return sectionRepo.findAll();
    }
    
    public List<Subsection> getAllSubsection(){
    	
    	return subsectionRepo.findAll();
    }
    
    public List<Categories> getAllCategories(){
    	
    	return categoriesRepo.findAll();
    }
    
    public List<ProductCategory> getAllProductCategory(){
    	
    	return productCategoryRepo.findAll();
    }
    
    @Transactional
    public void updateProductVisits(int id, int visits) {
        productRepo.updateVisits(id, visits);
    }
    
}

