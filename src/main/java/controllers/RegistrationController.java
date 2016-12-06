package controllers;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;


/* @author Cieran & Marcus */ 

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
	
	
	public String getName(){
		return name; }
	public String getEmail(){
		return email; }
	public String getPhone(){
		return phone; }
	public String getPassword(){
		return password; }
	
	public String setName(){
		this.name = name; }
	public String setEmail(){
		this.email = email; }
	public String setPhone(){
		this.phone = phone; }
	public String setPassword(){
		this.password = password; }
	
	
	public String register () {
		
		if(!name.isEmpty() && !email.isEmpty() && !phone.isEmpty() && !password.isEmpty()) {
			if (registrationService.validRegistration(name, email, phone, password)) {
				currentUser.setCustomer(reigistrationService.registerUser(email));
				return "Gnomepage2";
			}
			else {
				name = "";
				phone = "";
				password = "";
				return "Register";
			}
		}
			name = "";
			phone = "";
			password = "";
			return "Register"; 
}

>>>>>>> 4ae4b55f34aadc767ba826c1c6af9c0900770023
