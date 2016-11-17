
public interface CustomerManager {
	public Customer createNewCustomer(Customer customer);

	public Customer findByEmail(String email);

	public Customer findById(long id);

	public Customer updateCustomer(Customer customer);

	public Customer deleteCustomer(Customer customer);
}
