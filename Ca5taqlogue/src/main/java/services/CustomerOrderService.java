package services;

import java.util.List;

import javax.ejb.Stateless;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

import models.CustomerOrder;
import models.CustomerOrderManager;

@Stateless
public class CustomerOrderService {
	
	
	@Inject
	CustomerOrderManager customerOrderManager;
	
	
	public List<CustomerOrder> returnAll(){
		return customerOrderManager.returnAll();
	}
	
	
	
	
	
}
