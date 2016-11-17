
public interface SupplierManager {

	// Find by supplierId
	public Supplier findById(int supplierId);

	// Find by supplierName
	public Supplier findBySupplierName(String supplierName);

}