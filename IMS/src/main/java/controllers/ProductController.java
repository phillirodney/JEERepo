package controllers;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.Path;

import services.*;
import models.*;

@Named("products")
@RequestScoped
public class ProductController {
	@Inject
	private selectedProduct product;
	@Inject
	private ProductService productService;
	
	
	private String name;
	
	private String description;
	
	private double price;
	
	
	
	/**
	 * This is used by JSF pages to select a product to display and then redirect the user to the product page.
	 * 
	 * @param id
	 * @return
	 */
	public String select(int id) {
		Product item = productService.findProductById(id);
		if (item != null) {
			product.setProduct(item);
			return "Product";
		}
		return "Browse";
	}
	
	
	public void setName(String name){
		
		this.name = name;
		
	}
	
	public void setDescription(String description){
		
		this.description = description;
	}
	
	public void setPrice(double price) {
		
		this.price = price;
		
	}
	
	public String makeProduct() {
		
		productService.createProduct(name, description, price);
		
		return "Imstuff";
	}
	
	public String getName() {
		return name;
	}


	public String getDescription() {
		return description;
	}


	public double getPrice() {
		return price;
	}
	
	
}
