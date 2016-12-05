package controllers;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.faces.model.DataModel;
import javax.inject.Inject;
import javax.inject.Named;

import services.*;
import models.*;


/*
 * @author Luke
 * 
 */

@Named("search")
@RequestScoped
public class SearchController {
	
	@Inject
	private searchService searchService;
	
	private String term;
	
	private List<Product> results = null;
	
	
	
	/**
	 * Handles the searching of the catalogue using the term set via setTerm()
	 * 
	 * @return returns searchResults for the list of results or product if a single product was found. returns browse if none were found
	 */
	
	public String search(){
		
		results = searchService.findByKeyword(term);

		if (results != null){
				return "Products";
		}
		return "Browse";

	}

	public String getTerm() { return term; }
	
	public void setTerm(String term) { this.term = term; }
	
}