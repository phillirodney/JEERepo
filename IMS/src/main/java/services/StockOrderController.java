package services;


import javax.ejb.Stateless;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@RequestScoped
@Named("stock")
public class StockOrderController {
	
	@Inject
	orderPDFCreate orderPDFcreate;
	
	public String generateOrder() {
		
		orderPDFcreate.makeReport();
		return "Imstuff";
	}
	
	
	
	
}
