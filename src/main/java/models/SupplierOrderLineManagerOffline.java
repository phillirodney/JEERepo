package models;

import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

/* @author: philli */

@Stateless
@Default
public class SupplierOrderLineManagerOffline {

	@Inject
	private TestData testData;

	public SupplierOrderLine createSupplerOrderLine(SupplierOrderLine supplierOrderLine) {

		List<SupplierOrderLine> supplierOrderLines = testData.getSupplierOrderLines();
		supplierOrderLine.setSupplierOrderLineId(supplierOrderLines.size() + 1);
		testData.setSupplierOrderLines(supplierOrderLines);
		return findSupplierOrderById(supplierOrderLine.getSupplierOrderLineId());

	}
	
	public SupplierOrderLine findSupplierOrderById(int supplierOrderId) {
		for(SupplierOrderLine so: testData.getSupplierOrderLines()) {
			if(so.getSupplierOrderLineId() == supplierOrderId) {
				return so;
			}
		}
		return null; 
	}
	
	public SupplierOrderLine updateSupplierOrderLine(SupplierOrderLine supplierOrderLine) {
		return supplierOrderLine;
	}
	
	public void deleteSupplierOrderLine(SupplierOrderLine supplierOrderLine) {
		
		List<SupplierOrderLine> supplierOrderLines = testData.getSupplierOrderLines();
		for(SupplierOrderLine so: supplierOrderLines) {
			if(so.getSupplierOrderLineId() == supplierOrderLine.getSupplierOrderLineId()) {
				supplierOrderLines.remove(so);
				break;
			}
		}
		for(SupplierOrderLine so : supplierOrderLines) {
			if(so.getSupplierOrderLineId() > supplierOrderLine.getSupplierOrderLineId()) {
				so.setSupplierOrderLineId(so.getSupplierOrderLineId() -1);
			}
		}
	}

}
