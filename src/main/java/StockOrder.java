import java.util.*;
import javax.persistence.*;

@Entity
@Table(name="stock_orders")
public class StockOrder {

	@Id
	@Column(name="stock_order_id", nullable=false, unique=true)
	private int sOrderID;
	
	@Column(name="path")	
	private Date dateOrdered;
	
	public StockOrder(int orderID)
	{
		this.sOrderID = orderID; // change to implement unique order ID
		this.dateOrdered = new Date();	//date object created/current date
	}

	public int getsOrderID() {
		return sOrderID;
	}

	public void setsOrderID(int sOrderID) {
		this.sOrderID = sOrderID;
	}

	public Date getDateOrdered() {
		return dateOrdered;
	}

	public void setDateOrdered(Date dateOrdered) {
		this.dateOrdered = dateOrdered;
	}

	@Override
	public String toString() {
		return "Stock Order ID: " + sOrderID + ", Date Ordered: " + dateOrdered + ".";
	}
	
	
}

