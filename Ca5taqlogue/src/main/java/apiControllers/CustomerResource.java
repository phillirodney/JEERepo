package apiControllers;

import java.sql.Date;

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
import models.Product;
import models.ProductManager;

import services.LoginService;


@Path("/login")
public class CustomerResource {
	
	@Inject
	private LoginService loginService;
	
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Customer select(@PathParam("id") int id){
		
		return loginService.findById(id);
	}
	
	
	@Path("/query")
	@POST
	@Produces("text/plain")
	public String login(@QueryParam("email") String e, @QueryParam("password") String p ) {
		
		//loginService.loginUser(e);
		return "Success" ;
	}
	
	
	

}
