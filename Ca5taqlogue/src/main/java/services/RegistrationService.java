package services;

import models.*;

import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class RegistrationService {

	@Inject
	private CustomerManager customerManager;

	public boolean validRegistration(String email) {
		if (customerManager.findByEmail(email) == null) {
			return true;
		}
		return false;
	}

	public Customer registerUser(String name, String lastName, String email, String password) {
		Customer customer = customerManager.createNewCustomer(new Customer(name, lastName, email, password));
		return customer;
	}

}
