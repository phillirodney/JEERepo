package services;

import models.*;
import javax.inject.Inject;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

@RequestScoped
@Named(value="login")
public class LoginService {
	
	@Inject
	private CustomerManager customerManager;
	
	/**
	 * Checks to ensure that the provided credentials are valid.
	 * 
	 * @param email
	 * @param password
	 * @return
	 */
	public boolean validLogin(String email, String password) {
		Customer customer = customerManager.findByEmail(email.toLowerCase());
		return (customer.getPassword().equals(password))? true : false;
	}

	/**
	 * used to retrieve the customer from the entity manager
	 * 
	 * @param email
	 * @return
	 */
	public Customer loginUser(String email) {
		return customerManager.findByEmail(email.toLowerCase());
	}
	

}
