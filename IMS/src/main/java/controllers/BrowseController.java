package controllers;


/*
 * @author Luke
 * 
 */

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.ConversationScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;
import javax.inject.Named;
import models.*;

import services.ProductService;

@Named("browse")
@ConversationScoped
public class BrowseController implements Serializable{
	private static final long serialVersionUID = 7787469800840772887L;
	
	@Inject
	private ProductService productService;
	private List<Product> products = null;
	
	private void recreateModel() {
		
		products = null;
		
	}
	
	public List<Product> getProducts() {
		
		products = productService.findAll();
		return products;
	}
	
	
	
	

}
