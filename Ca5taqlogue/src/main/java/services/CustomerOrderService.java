package services;

import java.util.List;

import javax.ejb.Stateless;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

import models.CustomerManager;
import models.CustomerOrder;
import models.CustomerOrderManager;

@Stateless
public class CustomerOrderService {
	
	
	@Inject
	CustomerOrderManager customerOrderManager;
	
	@Inject
	CustomerManager customerManager;
	
	
	public List<CustomerOrder> returnAll(){
		return customerOrderManager.returnAll();
	}
	
	public List<CustomerOrder> getCustomerOrders(String email){
		return customerManager.findByEmail(email).getOrders();
	}
	
	
	
	
	
}
