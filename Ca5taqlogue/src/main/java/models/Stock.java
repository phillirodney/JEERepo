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
	@Column(name = "stock_id", nullable = false, unique = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int stockId;
	
	@Column(name= "product_id")
	private Product product;

	@Column(name = "present")
	private int present;

	@Column(name = "required")
	private int required;

	@Column(name = "reserved")
	private int reserved;

	private boolean porousware;
	
	public Stock() {
	}
	
	public Stock(int stockId, int present, int required, int reserved, boolean porousware)
	{
		this.stockId = stockId;
		this.present = present;
		this.required = required;
		this.reserved = reserved;
		this.setPorousware(porousware);
	}

	public int getStockId() {
		return this.stockId;
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

	public void setStockId(int stockId){
		this.stockId = stockId;
	}

	public boolean isPorousware() {
		return porousware;
	}

	public void setPorousware(boolean porousware) {
		this.porousware = porousware;
	}
}
