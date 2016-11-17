
public interface CustomerManager {
	// create new customer
	public Customer createNewCustomer(Customer customer);

	// find customer by email
	public Customer findByEmail(String email);

	// find customer by id
	public Customer findById(long id);

	// update customer
	public Customer updateCustomer(Customer customer);

	// delete customer
	public Customer deleteCustomer(Customer customer);
}
