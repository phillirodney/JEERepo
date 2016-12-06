package models;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


/*
 * @author Philli 
 * @author Cieran
 * @author Luke
 * @author Marcus
 * 
 */


@Entity
public class Product implements Serializable{


	private static final long serialVersionUID = 1L;

	@Id 
	private int productId;
	private String name;
	private String description;
	private double price;
	private long stockId;
	private long porouswareStockId;

	private List<String> images;
	public Product(){
	}

	public Product(int productId, String name, String description, double price, long stockId, long porouswareStockId, List<String> imagepath) {
		
		this.productId = productId;
		this.name = name;
		this.description = description;
		this.price = price;
		this.images = imagepath;
		this.stockId = stockId;
		this.porouswareStockId = porouswareStockId;
		
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public List<String> getImages() {
		return images;
	}

	public void setImages(List<String> images) {
		this.images = images;
	}

	public long getStockId() {
		return stockId;
	}

	public boolean isPorousware() {
		return false;
	}

	public void setStockId(long stockId) {
		this.stockId = stockId;
	}

	public void setPorousware(boolean porousware) {
		//this.porousware = porousware;
		
	}
}