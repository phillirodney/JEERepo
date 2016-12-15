package apiControllers;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import models.Product;
import models.ProductManager;

import javax.ws.rs.Path;
// The Java class will be hosted at the URI path "/helloworld"
@Stateless
@Path("/helloworld")
public class HelloWorldResource {
	
	@Inject
	ProductManager productManager;
    
    // The Java method will process HTTP GET requests
    @GET
    // The Java method will produce content identified by the MIME Media
    // type "text/plain"
    @Produces({MediaType.APPLICATION_JSON})
    public Product getClichedMessage() {
        // Return some cliched textual content
        return productManager.findProductById(1);
    }
}