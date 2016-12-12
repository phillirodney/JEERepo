package services;

import models.*;

import javax.ejb.Stateless;
import javax.inject.Inject;


@Stateless
public class RegistrationService {
	
	@Inject
	private CustomerManager customerManager;
	
	
	public boolean validRegistration(String email) {
		if(customerManager.findByEmail(email) == null){
			return true;
		}
		return false;
	}
	
	public Customer registerUser(String name, String email, String phone, String password) {
			Customer customer = customerManager.createNewCustomer(new Customer(name, email, phone, password));
			return customer;
	 }	

}

