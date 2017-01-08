package apiControllers;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import models.Product;
import services.CriteriaService;
import services.ProductService;
import services.searchService;

@Path("/search")
public class SearchResource {
	
	@Inject
	searchService SearchService;
	
	@Inject
	ProductService productSevice;
	
	@Inject
	CriteriaService cService;
	
	@GET
	@Path("/{word}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Product> search(@PathParam("word") String word){
		
		List<Product> results = SearchService.findByKeyword(word);

		return results;

	}
	

	@GET
	@Path("/")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Product> browse() {
		return productSevice.findAll();
		
	}
	
	@GET
	@Path("/material/{word}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public List<Product> findby(@PathParam("id") String material) {
		
		
			System.out.println(material);
		
		return null;
		//List<Product> results = cService.findbyCriteria(material);
		//return results;

			
	}
	
	@GET
	@Path("/Price")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Product> findbyPriceRange(@QueryParam("minPrice") int minPrice, @QueryParam("maxPrice") int maxPrice){
		List<Product >results = cService.findByRange(minPrice, maxPrice);
		return results;
	
	}
	

}
