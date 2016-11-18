import java.util.*;

@Stateless
@Default
public class AddressManagerOffline implements AddressManager {

	@Inject
	private TestData testdata

	
	public Address findByAddressId(String addressId) {
		for(Address address: testdata.getAddresses()){
			if(address.getaddressId() == addressId){
				return address;
			}
		}
		return null;
	}

	public List<Address> findByCustomerId(int customerId) {
		for(Customer customer: testdata.getCustomers()){
			if(customer.getId() == customer.getId()){
				return customer.getAddresses();
			}
		}
		return null;
	}

	public Address findByAddress(String postcode, int houseNumber) {
		
		for(Address address: testdata.getAddresses()){
			if((address.getpostcode().equals(postcode)) && (address.gethouseNumber() == houseNumber)){
				return address;
			}
		}
		return null;
	}

	public Address createNewAddress(Address address) {
		
		testdata.se
		
		return null;
	}

	public void updateAddress(Address address) {
		// TODO Auto-generated method stub
		
	}

	public void deleteAddress(Address address) {
		// TODO Auto-generated method stub
		
	}
	
}
