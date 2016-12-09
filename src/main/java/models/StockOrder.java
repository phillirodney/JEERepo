package models;
import java.util.*;
import javax.persistence.*;



/*
 * @author Cieran
 * @author Philli
 * 
 */

@Entity
@Table(name="stock_orders")
public class StockOrder {

	@Id
	@Column(name="stock_order_id", nullable=false, unique=true)
	private int stockOrderID;
	
	@Column(name="date_ordered")
	private Date dateOrdered;

	@ManyToOne
	@JoinColumn(name="supplier_id")
	private Supplier supplier;
	
	public StockOrder(int orderID)
	{
		this.stockOrderID = orderID; // change to implement unique order ID
		this.dateOrdered = new Date();	//date object created/current date
	}

	public int getstockOrderID() {
		return stockOrderID;
	}

	public void setsOrderID(int sOrderID) {
		this.stockOrderID = sOrderID;
	}

	public Date getDateOrdered() {
		return dateOrdered;
	}

	public void setDateOrdered(Date dateOrdered) {
		this.dateOrdered = dateOrdered;
	}

	@Override
	public String toString() {
		return "Stock Order ID: " + stockOrderID + ", Date Ordered: " + dateOrdered + ".";
	}
	
	public Supplier getSupplier() {
		return this.supplier;
	}
	
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	
	
}

