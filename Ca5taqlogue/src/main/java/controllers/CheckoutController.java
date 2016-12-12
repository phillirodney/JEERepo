package controllers;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

import models.Basket;
import models.CustomerOrder;
import models.OrderLine;
import services.BasketService;
import services.CheckoutService;

/* @author Cieran */
	
@RequestScoped
@Named (value = "checkout")
public class CheckoutController {
	
	@Inject 
	private CurrentUser currentUser;
	
	@Inject
	private BasketService basketService;
	
	@Inject
	private CheckoutService checkoutService;
	
	List<Basket> basket_list;
	
	public String makeOrder() {
		
		CustomerOrder order = checkoutService.createNewCustomerOrder();
		
		currentUser.getCustomer().getOrders().add(order);
		
		for(Basket b : currentUser.getCustomer().getBaskets()){
			
			OrderLine orderline = checkoutService.createNewCustomerOrderLine();
			
			orderline.setProduct(b.getProduct());
			
			order.getOrderLines().add(orderline);

		}
		
		return "ConfirmCheckout";
			
		
		
		
	}
}	
