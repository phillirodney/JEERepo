package controllers;

import java.util.List;

import models.*;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named("user")
@SessionScoped
public class CurrentUser implements Serializable {

	private static final long serialVersionUID = 1L;

	private Customer customer = null;
	private Basket basket = new Basket();

	public List<CustomerOrder> getOrders() {

		return customer.getOrders();

	}

	public boolean isLoggedIn() {
		return (customer == null) ? false : true;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Basket getBasket() {
		return basket;
	}

	public void setBasket(Basket basket) {
		this.basket = basket;
	}

	public int basketPrice() {
		int price = 0;
		for (Basket b : customer.getBaskets()) {
			price += (b.getProduct().getPrice())*b.getQuantity();
		}
		return price;
	}
}