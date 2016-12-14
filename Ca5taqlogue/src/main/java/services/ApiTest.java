package services;

import models.*;
import javax.ejb.Stateless;
import javax.inject.Inject;

import javax.ws.rs.*;
import javax.ws.rs.core.*;

@Stateless
@Path("Test")
public class ApiTest {
	
	@Inject
	private CustomerManager cM;
	
	@GET
	@Produces({MediaType.APPLICATION_XML})
	@Path("hellop")
	public Customer getTestData(){
		
		return cM.findById(1);
	}

}
