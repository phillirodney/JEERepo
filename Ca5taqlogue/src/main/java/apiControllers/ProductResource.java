package apiControllers;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import models.Product;
import services.ProductService;

@Path("/products")
public class ProductResource {
	
	@Inject
	ProductService productService;
	
	
	
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Product select(@PathParam("id") int id) {
		return productService.findProductById(id);
	}
	
	
	@GET
	@Path("/")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Product> browse() {
		return productService.findAll();
		
	}

}
