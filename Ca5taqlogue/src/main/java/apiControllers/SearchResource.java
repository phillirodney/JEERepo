package apiControllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import models.Product;
import services.CriteriaService;
import services.ProductService;
import services.searchService;

import com.google.gson.*;


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
	@Consumes("text/plain")
	public List<Product> findby(@PathParam("word") String material)  {
		
		List<Product> results = new ArrayList<>();
		material = material.replaceAll("\\[", "").replaceAll("\\]","");
		String[] materials = material.split("[^a-zA-Z]+");
		String[] newMaterials = Arrays.copyOfRange(materials, 1, materials.length);
		for(String x: newMaterials){
			results.addAll(cService.findbyCriteria(x));
		}
	
		
		for(Product x: results){
			System.out.println(x);
		}
		return results;

			
	}
	
	@GET
	@Path("/Price")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Product> findbyPriceRange(@QueryParam("minPrice") int minPrice, @QueryParam("maxPrice") int maxPrice){
		List<Product >results = cService.findByRange(minPrice, maxPrice);
		return results;
	
	}
	
	@GET
	@Path("/isporous/{porous}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Product> findbyPorous(@PathParam("porous") String porous) {
		if(porous.equals("trues")){
			return cService.findByPorous();
		}else{
			return browse();
		}
	}
	

}
