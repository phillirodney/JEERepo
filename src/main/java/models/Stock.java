package models;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


/*
 * @author Marcus
 * 
 */

public class Stock {


	@Id
	@Column(name = "product_id", nullable = false, unique = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int productId;

	@Column(name = "present")
	private int present;

	@Column(name = "required")
	private int required;

	@Column(name = "reserved")
	private int reserved;

	public Stock() {
	}
	
	public Stock(int productId, int present, int required, int reserved)
	{
		this.productId = productId;
		this.present = present;
		this.required = required;
		this.reserved = reserved;
	}

	public int getProductId() {
		return this.productId;
	}

	public int getPresent() {
		return this.present;
	}

	public int getRequired() {
		return this.required;
	}

	public int getReserved() {
		return this.reserved;
	}

	public void setProductId(int productId){
		this.productId = productId;
	}
}
