package controllers;

/*
 * @author Luke
 * 
 */

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import models.*;



@SessionScoped
@Named("selected")
public class selectedProduct implements Serializable{
	private static final long serialVersionUID = -182947382947382l;
	private Product product;
	
	public Product getProduct() {return product;}
	public void setProduct(Product product){this.product = product;}
	

}
