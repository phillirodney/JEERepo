package controllers;

import java.util.List;

import models.*;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named("selectedims")
@SessionScoped
public class SelectedProductIms implements Serializable {
	
	Product product;

	private static final long serialVersionUID = 143243L;
	
	public String selectProduct(Product product){
		
		if(product==null) return null;
		this.product = product;
		
		return "Imstuff";
		
		
	}
	
	public Product getProduct() {
		
		return this.product;
	}
}
