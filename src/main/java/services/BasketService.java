package services;

import java.util.List;

/* @author Philli */
import javax.ejb.Stateless;
import javax.inject.Inject;

import models.Basket;
import models.BasketManager;
import models.Product;
import models.ProductManager;

@Stateless
public class BasketService {
	
	@Inject
	private BasketManager basketManager;

	Basket basket = new Basket();
	
	public List<Basket> findBasketsByCustomerId(int id) {
		return basketManager.findBasketsByCustomerId(id);
	}
	
	public Basket findById(int id) {
		return basketManager.findById(id);
	}
	
	
	
}
