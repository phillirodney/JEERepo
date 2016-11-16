
public class OrderLine {

	private int lineID;
	private int productID;

	public OrderLine() {
	}

	public OrderLine( int lineID, int productID){
		this.lineID = lineID;
		this.productID = productID;
	}

	public int getLineID() {
		return lineID;
}

	public void setLineID(int lineID){
		this.lineID = lineID;
}

	public int getProductID(){
		return productID;
}

	public int setProductID(int productID) {
		this.productID = productID;
	}

}