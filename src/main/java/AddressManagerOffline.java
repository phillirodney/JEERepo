

import java.util.ArrayList;
import java.util.List;


import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

/**
 * This is the address model
 * 
 * @author ....
 * @Version 1.0
 * @since 2016-09-14
 * 
 * */


@Stateless
@Default
public class AddressManagerOffline implements AddressManager {

	@Inject
	private TestData testdata;

	@Override
	public Address findByAddressId(int addressId) {
		for(Address address: testdata.getAddresses()){
			if(address.getaddressId() == addressId){
				return address;
			}
		}
		return null;
	}

	@Override
	public List<Address> findByCustomerId(int customerId) {
		for(Customer customer: testdata.getCustomers()){
			if(customer.getId() == customer.getId()){
				return customer.getAddresses();
			}
		}
		return null;
	}

	@Override
	public Address findByAddress(String postcode, int houseNumber) {
		
		for(Address address: testdata.getAddresses()){
			if((address.getpostcode().equals(postcode)) && (address.gethouseNumber() == houseNumber)){
				return address;
			}
		}
		return null;
	}

	@Override
	public Address createNewAddress(Address address) {

		List<Address> addresses = testdata.getAddresses();
		address.setaddressId(addresses.size()+1);
		addresses.add(address);
		testdata.setAddresses(addresses);

		return findByAddressId(address.getaddressId());

	}

	@Override
	public void updateAddress(Address address) {

		//Don't think this is correct

		List<Address> addresses = testdata.getAddresses();

		int index = 0;

		for(Address a: addresses){
			if (a.getaddressId() == address.getaddressId())
				index = a.getaddressId();
		}
		if(index < 0) return;

		addresses.set(index, address);
		testdata.setAddresses(addresses);
		
	}

	@Override
	public void deleteAddress(Address address) {

		List<Address> addresses = testdata.getAddresses();

		addresses.remove(address);
		
	}
	
}
