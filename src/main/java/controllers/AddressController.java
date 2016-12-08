package controllers;

import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import services.*;

@RequestScoped
@Named(value = "address")

public class AddressController {
	
	@Inject
	private CurrentUser currentUser;
	
	private int houseNumber;
	
	private String street = "";
	
	private String city = "";
	
	private String postcode = "";
	
	public int getHouseNumber(){
		return this.houseNumber;
	}
	
	public String getStreet(){
		return this.street;
	}
	
	public String getCity(){
		return this.city;
	}
	
	public String getpostCode(){
		return this.postcode;
	}
	
	public void setHouseNumber(int houseNumber){
		this.houseNumber = houseNumber;
	}
	
	public void setStreet(String street){
		this.street = street;
	}
	
	public void setCity(String city){
		this.city = city;
	}
	
	public void setPostCode(String postcode){
		this.postcode = postcode;
	}
	
	public void changeHouseNumber(){
		currentUser.getCustomer().getAddresses().sethouseNumber(houseNumber);
	}
	
	public void changeStreet(){
		currentUser.getCustomer().getAddresses().setstreet(street);
	}
	
	public void changeCity(){
		currentUser.getCustomer().getAddresses().setcity(city);
	}
	
	public void changePostcode(){
		currentUser.getCustomer().getAddresses().setpostcode(postcode);
	}
	
	
}