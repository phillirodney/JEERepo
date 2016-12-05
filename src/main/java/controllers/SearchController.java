package controllers;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named("search")
@RequestScoped
public class SearchController {
	@Inject
	private SearchService searchService;
	@Inject 
	private SelectedProduct selectedProduct;
	@Inject
	private SearchResultsController searchResults;
	private String term;
	
	private DataModel<ProductItem> results = null;
	
	
	
	/**
	 * Handles the searching of the catalogue using the term set via setTerm()
	 * 
	 * @return returns searchResults for the list of results or product if a single product was found. returns browse if none were found
	 */
	public String search(){
		
		List<ProductItem> results = searchService.searchBy(term);
		if (results != null)
			if (results.size() == 1) {
				selectedProduct.setProduct(results.get(0));
				return "product";
			} else {
				return "Producs";
			}
		return "Products";
	}

	public String getTerm() { return term; }
	public void setTerm(String term) { this.term = term; }
	
}