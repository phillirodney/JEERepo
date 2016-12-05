package controllers;
import java.io.Serializable;

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
	public String setEmail (String email){
		this.email = email; }
	public String setPassword (String password){
		this.password = password; }
}
