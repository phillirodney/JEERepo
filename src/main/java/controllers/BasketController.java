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
import services.BasketService;

/* @author Philli */

@RequestScoped
@Named(value = "basket")
public class BasketController {

	@Inject
	private CurrentUser currentUser;

	@Inject
	private BasketService basketService;



	public void addToBasket(Product product) {
		Basket basket = new Basket();
		currentUser.getCustomer().getBaskets();
		//add basket to current user 
	}
	
	public void removeFromBasket(Product product) {
		Basket basket = new Basket();
		basket.remove(currentUser);
	}

}
