package controllers;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/* @author Cieran */ 

@RequestScoped
@Named(value = "registration")

public class RegistrationController {
	
	@Inject 
	private CurrentUser currentUser;
	
	@Inject 
	private RegistrationService registrationService;
	
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
	}


}

