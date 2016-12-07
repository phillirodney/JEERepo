package models;
import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Type;

/*
 * @author Hayley
 * 
 */

public class Payment {




	@Id
	@Column(name = "card_number", nullable = false, unique = true)
	@GeneratedValue
	private String cardNumber;

	//Uni-Directional Relationship
	@ManyToOne
	@JoinColumn(name = "address_id")
	private Address address;


	@ManyToOne
	@JoinColumn(name= "customer_id")
	private Customer customer;

	@Column(name = "expiry_date", nullable = false)
	@Type(type = "expiryDate")
	@NotNull
	private Date expiryDate;
	
	public Payment() {

	}

	public Payment(String cardNumber, Address address, Date expiryDate) {

		this.cardNumber = cardNumber;
		this.address = address;
		this.expiryDate= expiryDate;

	}

	public String getCardNumber(){
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public Address getAddress() {
		return address;

	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

}
