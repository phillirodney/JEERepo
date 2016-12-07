package services;

import java.util.List;

/* @author Philli */
import javax.ejb.Stateless;
import javax.inject.Inject;

import controllers.CurrentUser;
import models.*;

@Stateless
public class specialService {
	
	@Inject
	private BasketManager manager;
	
	
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
