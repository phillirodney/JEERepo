
Public class OrderLine {


private int LineID;
private int ProductID;

public OrderLine(){
	}

public orderLine( int LineID, int ProductID){
	this.LineID = LineID;
	this.ProductID = ProductID;
	}

public getLineID() {
	return LineID;
}
public void setLineID(){
	this.LineID = LineID;
}
public getProductID(){
	return ProductID;
}
public setProductID(){
	this.ProductID = ProductID;
}

}