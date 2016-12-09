package services;

import javax.ejb.Stateless;
import javax.inject.Inject;

import models.Basket;
import models.BasketManager;
import models.Customer;
import models.CustomerOrderManager;

/* @author Cieran */

@Stateless
public class CheckoutService {
	
	@Inject 
	private BasketManager basketManager;
	@Inject
	private CustomerOrderManager customerOrderManager;
	
	public void createOrder(Basket basket, Customer customer) {
	}
	

	
}
