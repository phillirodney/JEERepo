package models;

/* @author: philli */
public interface SupplierOrderLineManager {

	SupplierOrderLine createSupplerOrderLine(SupplierOrderLine supplierOrderLine);

	SupplierOrderLine findSupplierOrderById(int supplierOrderId);

	SupplierOrderLine updateSupplierOrderLine(SupplierOrderLine supplierOrderLine);

	void deleteSupplierOrderLine(SupplierOrderLine supplierOrderLine);
}
