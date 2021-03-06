package controllers;

import javax.enterprise.context.SessionScoped;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;
import models.Product;
import services.*;

@SessionScoped
@Named("Criteria")

public class CriteriaController implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1890890L;

	@Inject
	private CriteriaService cService;

	private String material;
	private boolean porousware;
	
	List<Product> results;
	
	
	private int minPrice;
	private int maxPrice;
	
	

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;

	}

	public String findby() {
		results = cService.findbyCriteria(material);
		return "productCriteria";
				
	}
	
	public String findbyPriceRange(){
		results = cService.findByRange(minPrice, maxPrice);
		return "productCriteria";
	
	}
	
	public List<Product> getResults() {
		return results;
	}




	public int getMinPrice() {
		return minPrice;
	}

	public void setMinPrice(int minPrice) {
		this.minPrice = minPrice;
	}

	public int getMaxPrice() {
		return maxPrice;
	}

	public void setMaxPrice(int maxPrice) {
		this.maxPrice = maxPrice;
	}

	public void setPorousware(boolean porousware) {
		this.porousware = porousware;

	}
	
	
	public String findby1() {
		results = cService.findbyCriteria(porousware);
		return "productCriteria";
		
		
	}
	
	public List<Product> getResults1() {
		return results;
	}
	
}

