package models;
import java.util.List;

public interface SupplierManager {

	// Find by supplierId
	Supplier findById(int supplierId);

	// Find by supplierName
	List<Supplier> findBySupplierName(String supplierName);


	Supplier createSupplier(Supplier supplier);

	void updateSupplier(Supplier supplier);

	void deleteSupplier(Supplier supplier);


}