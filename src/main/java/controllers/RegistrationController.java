package controllers;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import services.*;


@RequestScoped
@Named(value = "registration")

public class RegistrationController {
	
	@Inject 
	private CurrentUser currentUser;
	
	@Inject 
	private RegistrationService registrationService;
	
	// These four variables to login and view the gnomes, the rest can be added in the account page
	private String name = "";
	private String email = "";
	private String phone = "";
	private String password = "";
	private String lastName = "";
	
	
	public String getName(){
		return name; }
	public String getEmail(){
		return email; }
	public String getPhone(){
		return phone; }
	public String getPassword(){
		return password; }
	
	public String getlastName(){
		return lastName; }
	
	public void change(){
		currentUser.getCustomer().setFirstName(name);
	}
	

	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email; 
	}
	public void setPhone(String phone) {
		this.phone = phone; 
	}
	public void setPassword(String password) {
		this.password = password; 
	}
	
	public void setlastName(String lastName) {
		this.lastName = lastName; 
	}

	public String register () {
		
		if(!name.isEmpty() && !email.isEmpty() && !password.isEmpty()) {
			if (registrationService.validRegistration(email)) {
				currentUser.setCustomer(registrationService.registerUser(name, email, phone, password));
				return "Gnomepage2";
			}
			else {
				name = "";
				phone = "";
				password = "";
				return "SignUp";
			}
			
			
		}
			name = "";
			phone = "";
			password = "";
			return "SignUp"; 
	}
}


