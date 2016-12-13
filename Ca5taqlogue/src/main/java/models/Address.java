package models;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/*
 * @Author: Hayley & Marcus
 * 
 */
@Entity
@Table(name = "addresses")

public class Address {

	@Id
	@GeneratedValue
	@Column (name = "address_id")
	private int addressId;
	
	@Column(name = "house_number", nullable=false)
	@NotNull
	private int houseNumber;
	
	@Column(name = "street", nullable=false, length=225)
	@Size(max=225)
	@NotNull
	private String street = "####";
	
	@Column(name = "city", nullable=false, length=225)
	@Size(max=225)
	@NotNull
	private String city  = "####";
	
	@Column(name = "postcode", nullable=false, length=225)
	@Size(max=225)
	@NotNull
	private String postcode  = "####";

	public Address(int addressId, int houseNumber, String street, String city, String postcode) {

		this.addressId = addressId;
		this.houseNumber = houseNumber;
		this.street = street;
		this.city = city;
		this.postcode = postcode;

	}
	
	public Address(){
		
	}

	public int getAddressId() {
		/**
		 * Getter method for the address Id
		 */
		
		return addressId;
	}
	
	public void setAddressId(int addressId){
		/**
		 * Setter for the address Id
		 */
		
		this.addressId = addressId;
	}

	
	public int getHouseNumber() {
		/**
		 * Getter for the house number
		 */
		
		return houseNumber;
	}

	public void setHouseNumber(int houseNumber) {
		/**
		 * Setter for house Number
		 */
		this.houseNumber = houseNumber;
	}
	
	public String getStreet() {
		/**
		 * Getter for Street 
		 */
		return street;
	}
	
	public void setStreet (String street) {
		/**
		 * Setter for the Street
		 */
		this.street = street;
	}
	
	public String getCity() {
		/**
		 * Getter for city
		 */
		return city;
	}
	
	public void setCity (String city) {
		/**
		 * Setter for the city
		 */
		this.city = city;
							
	}
	
	public String getPostcode(){
		/**
		 * Getter for the postcode
		 */
		return postcode;
	}
	
	public void setPostcode (String postcode){
		/**
		 * Setter for the postcode
		 */
		this.postcode = postcode;	
	}
	
}
