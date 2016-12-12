package services;

import javax.ejb.Stateless;
import javax.inject.Inject;

import models.Basket;
import models.BasketManager;
import models.Customer;
import models.CustomerOrder;
import models.CustomerOrderManager;
import models.OrderLine;
import models.OrderLineManager;

/* @author Cieran */

@Stateless
public class CheckoutService {
	
	@Inject 
	private BasketManager basketManager;
	@Inject
	private CustomerOrderManager customerOrderManager;
	
	@Inject
	private OrderLineManager orderLineManager;
	

	public boolean validCheckout(Basket basket, Customer customer) {
		
		for (Basket b: customer.getBaskets()){
			if(b.getProduct() == basket.getProduct()){
				return true;
			}
		}
		return false;
	}	
	
	public CustomerOrder createNewCustomerOrder(){
		CustomerOrder customerOrder = customerOrderManager.createNewCustomerOrder(new CustomerOrder());
		return customerOrder;
	}
	
	public OrderLine createNewCustomerOrderLine(){
		OrderLine orderline = orderLineManager.createOrderLine(new OrderLine());
		return orderline;
	} 
	
}
