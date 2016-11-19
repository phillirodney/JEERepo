import java.util.ArrayList;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

@Stateless
@Default
public abstract class CustomerManagerOffline implements CustomerManager {

	// create an array list of customers to return.
	ArrayList<Customer> list_of_customers = new ArrayList<Customer>();

	@Inject
	private TestData testData;

	public Customer findByEmail(String email) {
		for (Customer customer : testData.getCustomers())
			if (customer.getEmail().equalsIgnoreCase(email))
				return customer;
		return null;
	}

	// Add each new customer object to an ArrayList called Customer.
	public Customer createNewCustomer(Customer customer) {
		list_of_customers.add(customer);
		return customer;
	}

	// Find customers by their customerId and return the list
	public Customer findById(long id) {
		for (Customer customer : testData.getCustomers())
			if (customer.getId() == id) {
				System.out.println(id);

			}
		return null;
	}

	// Update a field in the customer table. 
	public void updateCustomer(Customer customer, String firstName,String updatedFirstName) {
		//for (Customer customer1 : testData.getCustomers())
//			if() {
//
//			}
			

	}

	public void deleteCustomer(Customer customer) {
	}
}
