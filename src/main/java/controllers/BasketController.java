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

	ArrayList<Product> list_of_products = new ArrayList<Product>();

	/**
	 * Method for customer to add products to their virtual basket
	 * 
	 * @param productId
	 * @param name
	 * @param description
	 * @param stockId
	 * @param imagepath
	 * @param porousware
	 * @return
	 */
	public void addToBasket(int productId, String name, String description, long stockId, List<String> imagepath,
			boolean porousware) {
		Product product = new Product();
		list_of_products.add(product);
	}

}
