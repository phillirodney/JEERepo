import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class Product extends Stock {

	@Id
	@GeneratedValue
	@Column(name = "product_id")
	private int productId;

	@Column(name = "name")
	private String name;

	@Column(name = "quantity")
	private int quantity;

	ArrayList<String> images = new ArrayList<String>();

	public Product(int productId, String name, int quantity, long stockId, String stockRequired, String stockReserved,
			String currentStock, Boolean porousware) {

		this.productId = productId;
		this.name = name;
		this.quantity = quantity;

	}

	public int getproductId(int productId) {
		return productId;
	}

	public void setproductId() {
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