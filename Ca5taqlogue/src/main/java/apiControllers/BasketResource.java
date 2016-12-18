package apiControllers;

import java.sql.Date;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import models.Basket;
import models.Customer;
import models.CustomerManager;
import models.CustomerOrder;
import models.Product;
import models.ProductManager;
import services.BasketService;
import services.CustomerOrderService;
import services.LoginService;
import services.ProductService;

@Path("/basket")
public class BasketResource {
	
	
	@Inject
	BasketService basketService;
	
	@Inject
	ProductService productService;
	
	@Inject
	CustomerManager customerManager;
	
	@GET
	@Path("/mybasket")
	@Produces("text/plain")
	public String addToBasket(@QueryParam("id") int id, @QueryParam("email") String email){
		
		Basket basket = basketService.createBasket(productService.findProductById(id), 1);
		Customer customer = customerManager.findByEmail(email);
		if(customer.getBaskets().add(basket))
			return "Success";
		else{
			return "Failure";
		}
		
	}  
	
	
	
}
