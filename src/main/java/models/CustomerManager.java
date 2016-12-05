package models;
/**
 * This is the address model
 * 
 * @author Lewis
 * @Version 1.0
 * @since 2016-09-14
 * 
 * */
public interface CustomerManager {
	// create new customer
	public Customer createNewCustomer(Customer customer);

	// find customer by email
	public Customer findByEmail(String email);

	// find customer by id
	public Customer findById(long id);

	// update customer
	public void  updateCustomer(Customer customer);

	// delete customer
	public void  deleteCustomer(Customer customer);
}
