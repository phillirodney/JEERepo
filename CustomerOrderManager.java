
public interface CustomerOrderManager {
	// create a new customer order
	public CustomerOrder createNewCustomerOrder(CustomerOrder customerOrder);

	// find customer order by id
	public CustomerOrder findById(long id);

	// update a customer order
	public CustomerOrder updateCustomerOrder(CustomerOrder customerOrder);

}
