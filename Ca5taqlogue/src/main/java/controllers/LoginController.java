package controllers;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import services.LoginService;

/* @author Cieran */

@RequestScoped 
@Named (value = "login")
public class LoginController {
	
	@Inject 
	private CurrentUser currentUser;
	
	@Inject 
	private LoginService loginService; 
	private String email = "";
	private String password = "";
	
	public String getEmail(){
		return email; }
	public String getPassword(){
		return password; }
	public void setEmail(String email){
		this.email = email; 
	}
	public void setPassword(String password){
		this.password = password; 
	}
	
	
	public String login() {
		
		if(!email.isEmpty() && !password.isEmpty()) {
			if(loginService.validLogin(email, password)) {
				currentUser.setCustomer(loginService.loginUser(email));
				return "Gnomepage2";
			}
			else {
				password = "";
				email = "";
				return "Login";
			}
		}
		password = "";
		email = "";
		return "Login";
	}
		
	public String logout() {
		currentUser.setCustomer(null);
		return "Gnomepage2";
	}
}
