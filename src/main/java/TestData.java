import java.util.*;
import javax.annotation.*;
import javax.ejb.*;

@Startup
@Singleton
public class TestData {

	private List<Address> addresses;
	private List<Customer> customers;
	private List<CustomerOrder> customerOrders;
	private List<Stock> stock;

	@PostConstruct
	private void setupData() {
		addresses = new ArrayList<Address>();
		customers = new ArrayList<Customer>();
		customerOrders = new ArrayList<CustomerOrder>();
		stock = new ArrayList<Stock>();

		// AddData

		// Product product1 = new Product(1, "Gnome1", 10, 1, null, null, null,
		// null);
		Stock stock1 = new Stock();
		Customer customer1 = new Customer();

	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public List<CustomerOrder> getCustomerOrders() {
		return customerOrders;
	}

	public List<Stock> getStock() {
		return stock;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	public void setCustomerOrders(List<CustomerOrder> customerOrders) {
		this.customerOrders = customerOrders;
	}

	public void setStock(List<Stock> stock) {
		this.stock = stock;
	}
}
