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

import models.Customer;
import models.CustomerManager;
import models.CustomerOrder;
import models.Product;
import models.ProductManager;
import services.CustomerOrderService;
import services.LoginService;


@Path("/orders")
public class OrderResource {
	
	@Inject
	LoginService loginService;
	
	@Inject
	CustomerOrderService customerOrderService;
	 
	@GET
	@Path("/myorders")
	@Produces(MediaType.APPLICATION_JSON)
	public List<CustomerOrder> getOrders(@QueryParam("email") String e){
		return  customerOrderService.getCustomerOrders(e);
	}
	
	 
	
	
}
