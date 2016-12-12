package controllers;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

import models.Basket;
import services.BasketService;

/* @author Cieran */
	
@RequestScoped
@Named (value = "checkout")
public class CheckoutController {
	
	@Inject 
	private CurrentUser currentUser;
	
	@Inject
	private BasketService basketService;
	
	List<Basket> basket_list;
	
	public String addOrder() {
		
		if (currentUser.getCustomer().getBaskets() == null) {
			return "ShoppingBasket"; }
		
		Order orders = checkoutService.createOrder(basket_list);
		if (checkoutService.checkBasket(orders, currentUser.getCustomer())) {
			return "Checkout"; }
		
		}
}	
