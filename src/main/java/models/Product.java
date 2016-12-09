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
	private int stock;
	private long stockId;
	private long porouswareStockId;
	private int height;
	private int length;
	private int weight;
	
	private List<String> images;
	public Product(){
	}

	public Product(int productId, String name, String description, double price, int stock, long stockId, 
			long porouswareStockId, int height, int length, int weight, List<String> imagepath) {
		
		this.productId = productId;
		this.name = name;
		this.description = description;
		this.price = price;
		this.images = imagepath;
		this.stockId = stockId;
		this.porouswareStockId = porouswareStockId;
		this.height = height;
		this.length = length;
		this.weight = weight;
		this.stock = stock;

		
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

	public void setStockId(long stockId) {
		this.stockId = stockId;
	}

	public double getPrice() {
		return price;
	}

	public long getPorouswareStockId() {
		return porouswareStockId;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public void setPorouswareStockId(long porouswareStockId) {
		this.porouswareStockId = porouswareStockId;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
}