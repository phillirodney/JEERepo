package models;


import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;


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


/**
 * <p>This class is used for interacting with the test data associated with
 * with addresses
 * @author Luke
 * @author Hayley
 * @author Philli
 * @version 1.0
 * @see BasketManagerOffline
 * @see CustomerManagerOffline
 * @see CustomerOrderManagerOffline
 * @see OrderLineManagerOffline
 * @see PaymentsManagerOffline
 * @see StockerOrderManagerOffline
 * @see StockManagerOffline
 * @see SupplierManagerOffline
 * </p>
 */


@Stateless
@Default
public class AddressManagerOffline implements AddressManager {

	@Inject
	private TestData testdata;

	/**
	 * Searches through the test data trying to locate an address
	 * which has the ID of the paramater
	 *
	 * @param addressId to be searched for
	 * @return Address which has been found
	 */

	@Override
	public  Address findByAddressId(int addressId) {
		for(Address address: testdata.getAddresses()){
			if(address.getaddressId() == addressId){
				return address;
			}
		}
		return null;
	}

	/**
	 * A customer can have multiple addresses which is why a list of
	 * addresses is returned
	 *
	 * @param customerId
	 * @return List of addresses which is in a associated to a
	 * 		   particular customer
	 */

	@Override
	public Address findByCustomerId(int customerId) {
		for(Customer customer: testdata.getCustomers()){
			if(customer.getId() == customer.getId()){
				return customer.getAddresses();
			}
		}
		return null;
	}

	/**
	 * Another candidate key is the postcode and the house number of
	 * the address. This should therefore return only one address.
	 *
	 * @param postcode
	 * @param houseNumber
	 * @return Address which has been found
	 */

	@Override
	public Address findByAddress(String postcode, int houseNumber) {
		
		for(Address address: testdata.getAddresses()){
			if((address.getpostcode().equals(postcode)) && (address.gethouseNumber() == houseNumber)){
				return address;
			}
		}
		return null;
	}

	/**
	* <p>For deleting a specific address problems with the Id's will occur
	 * if done improperly. Here we found the highest value Id in the list
	 * and incremented it by one.</p>
	 *
	 * <p>Another way it could be implemented is by finding the size
	 * of the list and increasing it by one. There will
	 * be a problem however if a item in the list has been previously
	 * deleted. This would cause duplicate ID Values.</p>
	 *
	 * <p>A third way would be to the find the last value in the list and increment
	 * it by one. Although the {@code Arraylist} is a ordered. If items are
	 * added during retrieval the order may not remain the same.
	 * </p>
	 */

	@Override
	public Address createNewAddress(Address address) {

		List<Address> addresses = testdata.getAddresses();

		Address tempAddress = null;
		for(Address a: addresses){
			if(tempAddress == null){
				tempAddress = a;
			}else{
				if (a.getaddressId() > tempAddress.getaddressId())
					tempAddress = a;
			}
		}

		address.setaddressId(tempAddress.getaddressId());
		addresses.add(address);
		testdata.setAddresses(addresses);
		return findByAddressId(address.getaddressId());

	}

	/**
	 * Used to replace an existing version of an address with an
	 * updated version. It currently assumes that the ID of the
	 * replacement object is known
	 * @param address
	 */

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

	/**
	 * The method assumes that the address parameter refers to the SAME object
	 * that is going to be deleted.
	 * @param address the address used to specify the which item is to be deleted
	 */


	@Override
	public void deleteAddress(Address address) throws NoSuchElementException{

		List<Address> addresses = testdata.getAddresses();
		try {
			addresses.remove(address);
		}catch (NoSuchElementException e){
			//Exception Handling here
		}
		
	}


	
}
