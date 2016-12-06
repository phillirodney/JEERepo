package controllers;

import java.util.List;

import models.*;

import java.io.Serializable;

@Named("user")
@SessionScoped
public class CurrentUser implements Serializable {


	private static final long serialVersionUID = 1L;
	
	private Customer customer = null;
	
	public List<CustomerOrder> getOrd      ers() {
		
		return customer.getOrders();
		
	}
	
	
	public boolean isLoggedIn() {
		return (customer==null) ? false : true;
	}
	
	public Customer getCustomer() { return customer; }

	public void setCustomer(Customer customer) { this.customer = customer; }
}
	

