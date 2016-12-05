package models;


import javax.inject.Inject;
import java.util.List;
/**
 * This is the address model
 * 
 * @author Luke
 * @Version 1.0
 * @since 2016-09-14
 * 
 * */
public class CustomerOrderManagerOffline implements CustomerOrderManager {

    @Inject
    private TestData testData;


    @Override
    public CustomerOrder createNewCustomerOrder(CustomerOrder customerOrder) {
        List<CustomerOrder> customerOrders = testData.getCustomerOrders();
        customerOrder.setId(customerOrders.size() + 1);
        customerOrders.add(customerOrder);
        testData.setCustomerOrders(customerOrders);
        return(findById(customerOrder.getId()));
    }

    @Override
    public CustomerOrder findById(long id) {
        for(CustomerOrder customerOrder: testData.getCustomerOrders()){
            if(customerOrder.getId() == id){
                return customerOrder;
            }
        }
        return null;
    }

    @Override
    public void updateCustomerOrder(CustomerOrder customerOrder) {
    	
    	// no operation - for an in-memory

    	// database,

    	// we update automatically in real time
    	
    }

    @Override
    public void deleteCustomerOrder(CustomerOrder customerOrder) {

        List<CustomerOrder> customerOrders = testData.getCustomerOrders();
        for(CustomerOrder c: customerOrders){
            if(c.getId() == customerOrder.getId()) {
                customerOrders.remove(c);
                break;
            }
        }
        for(CustomerOrder c: customerOrders){
            if(c.getId() > customerOrder.getId()){
                c.setId(c.getId() - 1);
            }
        }
        testData.setCustomerOrders(customerOrders);


    }
}
