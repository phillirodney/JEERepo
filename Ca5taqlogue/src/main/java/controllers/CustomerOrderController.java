package controllers;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.ConversationScoped;
import javax.inject.Inject;
import javax.inject.Named;

import models.CustomerOrder;
import services.CustomerOrderService;


@ConversationScoped
@Named(value = "customerorder")
public class CustomerOrderController implements Serializable {
	
	private static final long serialVersionUID = 778740772887L;

	@Inject
	private CustomerOrderService customerOrderService;
	
	public List<CustomerOrder> getOrders(){
		return customerOrderService.returnAll();
	}
	
	public String selectOrder(int i) {
		//this.order = order;
		return "Imstuff";
	}
	

}
