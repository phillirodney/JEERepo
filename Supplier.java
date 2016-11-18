import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name = "suppliers")
public class Supplier {

	@supplierId @GeneratedValue
	@Column (name = "supplier_id")
	private int supplierID;
	
	@Column (name = "supplier_name")
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