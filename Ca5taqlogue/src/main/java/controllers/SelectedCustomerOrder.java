package controllers;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import models.*;


@SessionScoped
@Named("cuorder")
public class SelectedCustomerOrder implements Serializable {
	
	private static final long serialVersionUID = -1656556l;
	
	private CustomerOrder order;
	
	public CustomerOrder getOrder() {
		return this.order;
	}
	
	public String selectOrder(CustomerOrder order) {
		this.order = order;
		return "Imstuff";
	}
	
	public List<OrderLine> getOrderLines(){
		if(order == null){return null;}
		return order.getOrderLines();
	}
	
	public Customer getCustomer(){
		if(order == null){return null;}
		return order.getCustomer();
	}

}
