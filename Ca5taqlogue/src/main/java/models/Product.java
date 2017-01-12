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
 * @author Hayley
 * 
 */

@Entity
public class Product implements Serializable {

	private static final long serialVersionUID = 17897845642L;

	@Id
	private int productId;
	private Stock stock;
	private Stock porousStock;
	private String name;
	private String description;
	private double price;
	private int height;
	private int length;
	private int weight;
	private String material;
	private boolean porousware;
	
	

	private List<String> images;
	
	public Product() {
	}

	public Product(int productId, String name, String description, double price, Stock stock,
			Stock porousStock, int height, int length, int weight, List<String> imagepath, String material, boolean porousware) {


		this.name = name;
		this.description = description;
		this.price = price;
		this.images = imagepath;
		
		this.stock = stock;
		this.porousStock = porousStock;
		
		this.height = height;
		this.length = length;
		this.weight = weight;
		this.material = material;
        this.porousware = porousware;
        this.productId = productId;
		

	}

	public Product(String name, String desciption, double price, String description, String material, boolean porousware){
		this.name = name;
		this.description = description;
		this.price = price;
		this.material = material;
		this.porousware = porousware;
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


	public double getPrice() {
		return price;
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

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public Stock getStock() {
		return stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}

	public Stock getPorousStock() {
		return porousStock;
	}

	public void setPorousStock(Stock porousStock) {
		this.porousStock = porousStock;
	}

	public boolean getPorousware() {
		return porousware;
	}

	public void setPorousware(boolean porousware) {
		this.porousware = porousware;
	}




}