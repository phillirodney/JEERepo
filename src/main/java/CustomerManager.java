
public interface CustomerManager {
	// create new customer
	public Customer createNewCustomer(Customer customer);

	// find customer by email
	public Customer findByEmail(String email);

	// find customer by id
	public Customer findById(long id);

	// update customer
	public void Customer updateCustomer(Customer customer);

	// delete customer
	public void Customer deleteCustomer(Customer customer);
}
