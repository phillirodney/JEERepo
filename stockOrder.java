import java.util.*;
import javax.persistence.*;

@Entity
@Table(name="Stock Orders")
public class stockOrder {

	@Id
	@Column(name="Stock Order ID", nullable=false, unique=true)
	private int sOrderID;
	
	@Column(name="Path")
	private Date dateOrdered;
	
	public stockOrder(int orderID)
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

