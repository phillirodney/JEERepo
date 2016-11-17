import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

@Stateless
@Default
public class CustomerManagerOffline implements CustomerManager{

	@Inject
	private TestData testData;
	
	public Customer findByEmail(String email){
		for (Customer customer : testData.getCustomers())
			if (customer.getEmail().equalsIgnoreCase(email))
				return customer;
			return null;
	}

	public Customer createNewCustomer(Customer customer) {
		return null;
	}

	public Customer findById(long id) {
		return null;
	}

	public void updateCustomer(Customer customer) {	
	}

	public void deleteCustomer(Customer customer) {
	}
	
}
