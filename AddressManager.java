
public interface AddressManager {

	public Address findByAddressId(String addressId);
	// find by address
	
	public Address findByCustomerId(int customerId);
	//find by ID
	
	public Address findByAddress(String postcode, int houseNumber);
	//find by postcode and house number
	
	public Address createNewAddress(Address address);
	// create new address
	
	public void Address updateAddress(Address address);
	//update address
	
	public void Address deleteAddress(Address address);
	//delete address
}


	
	
	
}
