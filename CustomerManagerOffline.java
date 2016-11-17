@Stateless
@Default

public class CustomerManagerOffline implements CustomerManager{
	@Inject
	private TestData testData;
	
	@Override
	public Customer createNewCustomer(Customer customer){
		return customer;
	}
	
	@Override
	public Customer findByEmail (String email){
		for (Customer customer : testData.getCustomers())
			if (customer.getEmail().equalsIgnoreCase(email))
				return customer;
		return null;
	}
	
	@Override
	public Customer findById (long id){
		for (Customer customer : testData.getCustomers())
			if (customer.getId().equals(id))
				return customer;
	}
	
	@Override
	public Customer updateCustomer(Customer customer){
		return customer;
//	}
	
	@Override
	public Customer deleteCustomer(Customer customer){
		return customer;
	}
}
