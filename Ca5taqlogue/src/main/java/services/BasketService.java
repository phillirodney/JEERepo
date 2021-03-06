package services;

import java.util.List;

/* @author Philli */
import javax.ejb.Stateless;
import javax.inject.Inject;

import controllers.CurrentUser;
import models.*;

@Stateless
public class BasketService {
	
	@Inject
	private BasketManager manager;
	
	private Basket basket;
	
	
	public boolean checkBasket(Basket basket, Customer customer){
		
		for(Basket b: customer.getBaskets()){
			if(b.getProduct() == basket.getProduct()){
				return true;
			}
		}
		return false;
	}
	
	public Basket createBasket(Product product, int quantity){
		Basket basket = manager.createBasket(new Basket(product, quantity));
		return basket;
	}


}

