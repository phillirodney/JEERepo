package models;
import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
public class Product implements Serializable{


	private static final long serialVersionUID = 1L;

	@Id private int productId;


	private String name;


	private int quantity;

	ArrayList<String> images = new ArrayList<String>();

	public Product(){

	}

	public Product(int productId, String name, int quantity, long stockId, String stockRequired, String stockReserved,
			String currentStock, Boolean porousware) {

		this.productId = productId;
		this.name = name;
		this.quantity = quantity;

	}

	public int getproductId() {
		return productId;
	}

	public void setproductId(int productId) {
		this.productId = productId;
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public int getquantity() {
		return quantity;
	}

	public void setquantity(int quantity) {
		this.quantity = quantity;
	}

}