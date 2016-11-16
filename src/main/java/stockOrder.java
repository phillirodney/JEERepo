import java.util.*;

public class stockOrder {

	private int sOrderID;
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

