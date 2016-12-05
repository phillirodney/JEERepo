package controllers;

import java.io.Serializable;

import javax.enterprise.context.ConversationScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;
import javax.inject.Named;

@Named("browse")
@ConversationScoped
public class BrowseController implements Serializable{
	private static final long serialVersionUID = 7787469800840772887L;
	@Inject
	private ProductService productService;
	private DataModel<productItem> products = null;
	
	private void recreateModel() {
		
		products = null;
		
	}
	
	public DataModel<ProductItem> getProducts() {
		
		products = productService.findall();
		return products;
	}
	
	
	
	

}
