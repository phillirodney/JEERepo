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
	private String porousware;
	
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

	public String getPorousware() {
		return porousware;
	}

	public void setPorousware(String porousware) {
		this.porousware = porousware;
>>>>>>> 493d94f4d734dc0814a874d00ec41d3f3a35178e
	}
	
	
}

