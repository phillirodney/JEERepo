
public class Supplier {

	private int supplierID;
	private String supplierName;

	public Supplier() {
	}

	public Supplier(int supplierID, String supplierName) {
		this.supplierID = supplierID;
		this.supplierName = supplierName;
	}

	public int getSupplierID() {
		return supplierID;
	}

	public void setSupplierID(int supplierId) {
		this.supplierID = supplierID;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName() {
		this.supplierName = supplierName;
	}

}