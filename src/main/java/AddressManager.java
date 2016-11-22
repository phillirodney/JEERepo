
import java.util.List;

/**
 * This is the address model
 * 
 * @author ....
 * @Version 1.0
 * @since 2016-09-14
 * 
 * */
 



public interface AddressManager {

	Address findByAddressId(int addressId);
	// find by address
	
	List<Address> findByCustomerId(int customerId);
	//find by ID
	
	Address findByAddress(String postcode, int houseNumber);
	//find by post code and house number
	
	Address createNewAddress(Address address);
	// create new address
	
	void updateAddress(Address address);
	//update address
	
	void deleteAddress(Address address);
	//delete address
}
