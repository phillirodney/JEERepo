package models;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Luke
 */
public class SupplierManagerOffline implements SupplierManager {

    @Inject
    private TestData testData;

    @Override
    public Supplier findById(int supplierId) {

        for(Supplier s: testData.getSuppliers()){
            if(s.getSupplierID() == supplierId){
                return s;
            }
        }
        return null;
    }

    @Override
    public List<Supplier> findBySupplierName(String supplierName) {

        List<Supplier> namedSuppliers = new ArrayList<Supplier>();
        for(Supplier s: testData.getSuppliers()){
            if(s.getSupplierName().equals(supplierName)){
                namedSuppliers.add(s);
            }
        }
        return namedSuppliers;
    }

    @Override
    public Supplier createSupplier(Supplier supplier) {

        List<Supplier> suppliers = testData.getSuppliers();
        supplier.setSupplierID(suppliers.size()+1);
        suppliers.add(supplier);
        testData.setSuppliers(suppliers);
        return findById(supplier.getSupplierID());


    }

    @Override
    public void updateSupplier(Supplier supplier) {
    	
    	// no operation - for an in-memory

    	// database,

    	// we update automatically in real time

    }

    @Override
    public void deleteSupplier(Supplier supplier) {

        List<Supplier> suppliers = testData.getSuppliers();
        for(Supplier s: suppliers){
            if(s.getSupplierID() == supplier.getSupplierID()){
                suppliers.remove(s);
                break;
            }
        }
        for(Supplier s: suppliers){
            if(s.getSupplierID() > supplier.getSupplierID()){
                s.setSupplierID(s.getSupplierID() - 1);
            }
        }
        testData.setSuppliers(suppliers);

    }
}
