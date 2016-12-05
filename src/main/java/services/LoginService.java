package services;

import models.*;
import javax.ejb.Stateless;
import javax.inject.Inject;


@Stateless
public class LoginService {
	
	@Inject
	private CustomerManager customerManager;
	

	public boolean validLogin(String email, String password) {
		Customer customer = customerManager.findByEmail(email.toLowerCase());
		if(customer == null) {
			return false;
		}
		return (customer.getPassword().equals(password))? true : false; 
	}


	public Customer loginUser(String email) {
		return customerManager.findByEmail(email.toLowerCase());
	}
	
}
