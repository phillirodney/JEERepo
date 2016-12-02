package models;

import java.util.List;
import java.util.NoSuchElementException;

/**
 * Interface which is made to be implemented by a class could interact
 * with either persistent or non-persistent memory
 *
 * @author Team
 * @version 1.0
 *
 * @see BasketManager
 * @see CustomerManager
 * @see CustomerOrderManager
 * @see OrderLineManager
 * @see PaymentsManager
 * @see StockOrderManager
 * @see StockManager
 * @see SupplierManager
 */

/**
 * This is the address model
 * 
 * @author ....
 * @Version 1.0
 * @since 2016-09-14
 * 
 * */
 



public interface AddressManager {

	/**
	 * Finds an address by addressId
	 * @param addressId
	 * @return
	 */

	Address findByAddressId(int addressId);

	/**
	 * Finds addresse(s) by Customer Id
	 * @param customerId
	 * @return List of addresses which is in a associated to a
	 * 		   particular customer
	 */
	List<Address> findByCustomerId(int customerId);

	/**
	 * find address by composit candidate key of postcode and houseNumber.
	 * Should return only one address
	 * @param postcode
	 * @param houseNumber
	 * @return
	 */
	Address findByAddress(String postcode, int houseNumber);

	/**
	 * Creates a new address with a returns a reference to the newly
	 * created address.
	 * @param address
	 * @return
	 */
	
	Address createNewAddress(Address address);

	/**
	 * Updates an address
	 * @param address
	 */
	
	void updateAddress(Address address);

	/**
	 * Deletes an address
	 * @param address
	 * @throws NoSuchElementException
	 */
	
	void deleteAddress(Address address) throws NoSuchElementException;


	//Possibly create a delete which takes the ID (int) as a paramater

}
