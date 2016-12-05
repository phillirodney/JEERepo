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
}
