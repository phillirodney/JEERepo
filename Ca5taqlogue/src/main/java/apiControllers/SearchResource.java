package apiControllers;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import models.Product;
import services.ProductService;
import services.searchService;

@Path("/search")
public class SearchResource {
	
	@Inject
	searchService SearchService;
	
	@Inject
	ProductService productSevice;
	
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


}
