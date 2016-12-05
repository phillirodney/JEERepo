package services;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import models.*;

@Stateless
public class searchService {

	@Inject
	private ProductManager productRepository;

	public List<Product> findByKeyword(String term) {
		List<Product> results = new ArrayList<>();
		results.addAll(searchByProductName(term));
		for(Product product : searchByProductDescription(term))
			if(!results.contains(product))
				results.add(product);
		return results;
	}

	private List<Product> searchByProductName(String name) {
		return productRepository.findByName(name);
	}
		
	private List<Product> searchByProductDescription(String description) {
		return productRepository.findByDescription(description);
	}
	
	
	
	
}
