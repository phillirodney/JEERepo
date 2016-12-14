package services;

/* @author: philli*/
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import models.Product;
import models.ProductManager;
import models.Stock;
import models.StockManager;

@Stateless
public class ProductService {
	@Inject
	private ProductManager productManager;
	@Inject
	private StockManager stockManager;

	public Product findProductById(int id) {
		try {
			return productManager.findProductById(id);
		} catch (Exception e) {
			return null;
		}
	}

	public List<Product> findProductByName(String name) {
		return productManager.findProductByName(name);
	}

	public List<Product> findProductByDescription(String descrption) {
		return productManager.findProductByDescription(descrption);
	}

	public List<Product> findAll() {
		return productManager.returnAll();
	}

	public void createProduct(int productId, String name, String description, double price, Stock stock,
			Stock porousStock, int height, int length, int weight, List<String> imagepath, String material, String porousware){
			
		Product product = new Product();
		productManager.createProduct(product);
		
	}
}
