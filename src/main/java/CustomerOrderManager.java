/**
 * This is the address model
 * 
 * @author ....
 * @Version 1.0
 * @since 2016-09-14
 * 
 * */
public interface CustomerOrderManager {

	// create a new customer order
	 CustomerOrder createNewCustomerOrder(CustomerOrder customerOrder);

	// find customer order by id
	 CustomerOrder findById(long id);

	// update a customer order
	void updateCustomerOrder(CustomerOrder customerOrder);

	void deleteCustomerOrder(CustomerOrder customerOrder);


}
