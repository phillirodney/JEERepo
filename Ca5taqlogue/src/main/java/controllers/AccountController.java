package controllers;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/*author Cieran*/

@RequestScoped
@Named (value = "account ")

public class AccountController {
	
	@Inject 
	private CurrentUser currentUser;
	

}
