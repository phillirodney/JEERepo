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
	
	public List<Product> getResults() {
		return results;
	}

	public boolean getPorousware() {
		return porousware;
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

