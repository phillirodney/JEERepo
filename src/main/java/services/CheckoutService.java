package services;

import javax.ejb.Stateless;
import javax.inject.Inject;

import models.Basket;
import models.BasketManager;
import models.Customer;
import models.CustomerOrder;
import models.CustomerOrderManager;

/* @author Cieran */

@Stateless
public class CheckoutService {
	
	@Inject 
	private BasketManager basketManager;
	@Inject
	private CustomerOrderManager customerOrderManager;
	

	public boolean validCheckout(Basket basket, Customer customer) {
		
		for (Basket b: customer.getBaskets()){
			if(b.getProduct() == basket.getProduct()){
				return true;
			}
		}
		return false;
	}	
	
	public CustomerOrder createNewCustomerOrder(Basket basket, Customer customer){
		CustomerOrder customerOrder = customerOrderManager.createNewCustomerOrder(new CustomerOrder());
		return customerOrder;
	}
	
}
