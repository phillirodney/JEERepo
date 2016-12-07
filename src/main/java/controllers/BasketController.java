package controllers;
import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import models.Basket;
import models.Customer;
import models.Product;
import services.*;

/* @author Philli */

@RequestScoped
@Named(value = "Basket")
public class BasketController {

	@Inject
	private CurrentUser currentUser;
	

	@Inject
	private BasketService basketService;
	
	@Inject
	private selectedProduct product;
	
	private int quantity;

		

	public String addToBasket() {
		
		if(currentUser.getCustomer() == null){return "Product";}
		Basket basket = basketService.createBasket(product.getProduct(), 1);
		if(basketService.checkBasket(basket, currentUser.getCustomer())){return "Product";}
		currentUser.getCustomer().getBaskets().add(basket);
		return "Product";
	
		
	}
	
	public void removeFromBasket() {
		
		
		
	}

}
