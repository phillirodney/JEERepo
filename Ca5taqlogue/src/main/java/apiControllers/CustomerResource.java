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
import services.RegistrationService;


@Path("/login")
public class CustomerResource {
	
	@Inject
	private LoginService loginService;
	
	@Inject
	private RegistrationService rService;
	
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Customer select(@PathParam("id") int id){
		
		return loginService.findById(id);
	}
	
	
	@Path("/query")
	@GET
	@Produces("text/plain")
	public String login(@QueryParam("email") String e, @QueryParam("password") String p ) {
		if(loginService.validLogin(e, p)){
			return "Success";
		}else {
			return "Fail";
		}
		
		
		 
	}
	
	@Path("SignUp")
	@GET
	@Produces("text/plain")
	public String SignUp(@QueryParam("fname") String fname, @QueryParam("lname") String lname, @QueryParam("password") String password, @QueryParam("email") String email) {
		Customer customer = rService.registerUser(fname, lname, email, password);
		if(customer == null) {
			return "Success";
		}else {
			return "Fail";
		}
	}
	
	
	

}
