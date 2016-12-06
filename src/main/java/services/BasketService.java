package services;

import java.util.List;

/* @author Philli */
import javax.ejb.Stateless;
import javax.inject.Inject;

import controllers.CurrentUser;
import models.*;

@Stateless
public class BasketService {
	
	
	public boolean checkBasket(Basket basket, Customer customer){
		for(Basket b: customer.getBaskets()){
			if(b.getProduct() == basket.getProduct()){
				return false;
			}
		}
		return true;
	}


	
	
}
