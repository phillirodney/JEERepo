
public interface CustomerOrderManager {
	public CustomerOrder createNewCustomerOrder(CustomerOrder customerOrder);

	public CustomerOrder findById(long id);

	public CustomerOrder updateCustomerOrder(CustomerOrder customerOrder);

}
