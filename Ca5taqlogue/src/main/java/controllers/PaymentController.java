package controllers;

import java.util.Date;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import services.LoginService;
import controllers.CurrentUser;

/* @author Cieran */

@RequestScoped
@Named(value = "payment")

public class PaymentController {
	
	@Inject 
	private LoginService loginService;
	
	@Inject
	private CurrentUser currentUser;
	
	private String cardNumber = "";
	private Date expiryDate = null;
	private String nameOnCard = "";
	private short cvc = 0;
	
	
	public String getCardNumber() {
		return cardNumber; }
	public Date getExpiryDate() {
		return expiryDate; }
	public String getNameOnCard() {
		return nameOnCard; }
	public short getCVC() {
		return cvc; }
	
	
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	
	public void setExpiryDate( Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	
	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}
	
	public void setCVC(short cvc) {
		this.cvc = cvc;
	}
	
	
	public void changeCardNumber() {
		currentUser.getCustomer().getPayment().setCardNumber(cardNumber);
	}
	public void changeExpiryDate() {
		currentUser.getCustomer().getPayment().setExpiryDate(expiryDate);
	}
	public void changeNameOnCard() {
		currentUser.getCustomer().getPayment().setNameOnCard(nameOnCard);
	}
	public void changeCVC() {
		currentUser.getCustomer().getPayment().setCVC(cvc);
	}
	
	
	public String Entry() {
		
		if(!cardNumber.isEmpty() && !nameOnCard.isEmpty()) {
			if (paymentService.validPayment(cardNumber, nameOnCard)) {
				currentUser.setCustomer(paymentService.userPayment(cardNumber));
				return "Payment";
			}
			else {
				cardNumber = "";
				nameOnCard = "";
				return "Payment";
			}
		}
		cardNumber = "";
		nameOnCard = "";
		return "Payment";
		}
	public LoginService getLoginService() {
		return loginService;
	}
	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}
	}
