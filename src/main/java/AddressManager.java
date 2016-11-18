
public interface AddressManager {

	public Address findByAddressId(int addressId);
	// find by address
	
	public Address findByCustomerId(int customerId);
	//find by ID
	
	public Address findByAddress(String postcode, int houseNumber);
	//find by post code and house number
	
	public Address createNewAddress(Address address);
	// create new address
	
	public void updateAddress(Address address);
	//update address
	
	public void deleteAddress(Address address);
	//delete address
}
