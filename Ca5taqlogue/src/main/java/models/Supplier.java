package models;
import javax.persistence.*;
import java.util.List;

/*
 * @author Lewis
 * 
 */
@Entity
@Table (name = "suppliers")
public class Supplier {

	@Id
	@GeneratedValue
	@Column (name = "supplier_id")
	private int supplierID;
	
	@Column (name = "supplier_name")
	private String supplierName;

	@OneToMany(mappedBy = "supplier")
	private List<StockOrder> stockOrder;

	public Supplier() {
	}

	public Supplier(int supplierID, String supplierName) {
		this.supplierID = supplierID;
		this.supplierName = supplierName;
	}

	public int getSupplierID() {
		return supplierID;
	}

	public void setSupplierID(int supplierID) {
		this.supplierID = supplierID;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	
}