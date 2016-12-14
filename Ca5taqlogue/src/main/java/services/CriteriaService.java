package services;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import models.*;

@Stateless

public class CriteriaService {
	
	@Inject
	private ProductManager pManager;
	
	public List<Product> findbyCriteria(String material) {
		List<Product> pList = new ArrayList<>();
		pList = pManager.findbyMaterial(material);
		return pList;

		}
	
	
public List<Product> findbyCriteria (boolean porousware) {
	List<Product> pList = new ArrayList<>();
	pList = pManager.findbyPorousware(porousware);
return pList;
	
	
	
}}


