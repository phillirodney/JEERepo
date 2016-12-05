package models;
import java.util.*;
import javax.annotation.*;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.ejb.*;
import javax.persistence.criteria.Order;

/*
 * @author Team
 * 
 */


@Startup
@Singleton
public class TestData {

	private List<Address> addresses;
	private List<Customer> customers;
	private List<CustomerOrder> customerOrders;
	private List<Stock> stock;
	private List<Basket> baskets;
	private List<OrderLine> orderLines;
	private List<Payment> payments;
	private List<Product> products;
	private List<StockOrder> stockOrders;
	private List<Supplier> suppliers;

	@PostConstruct
	private void setupData() {
		addresses = new ArrayList<Address>();
		customers = new ArrayList<Customer>();
		customerOrders = new ArrayList<CustomerOrder>();
		stock = new ArrayList<Stock>();
		baskets = new ArrayList<Basket>();
		orderLines = new ArrayList<OrderLine>();
		payments = new ArrayList<Payment>();
		products = new ArrayList<Product>();
		stockOrders = new ArrayList<StockOrder>();
		suppliers = new ArrayList<Supplier>();


		// AddData
		//Address address1 = new Address(null, 0, null, null, null);
		Address address1 = new Address(1, 123, "Fake Street", "Springfield", "SP10 8RT");
		Address address2 = new Address(2, 666, "1st Avenue", "Hometown", "NYC 10" );
		Address address3 = new Address(3, 100, "Snake Way", "Jonestown", "SW90 SRT");
		Address address4 = new Address(4, 345, "Basic Close", "Basictown", "BSC1 RTY");
		Address address5 = new Address(5, 742, "Evergreen Terrace", "Springfield", "SP11 EGT");
		Address address6 = new Address(6, 10, "Downing Street", "London", "LDN 10");
		Address address7 = new Address(7, 888, "Some Street", "Sometown", "SMPC ODE");
		Address address8 = new Address(8, 777, "Luke Street", "Teamthree", "TM3 LKE");
		
		//Product product1 = new Product(1, "Gnome1", 10, 1, null, null, null, null);
		List<String> paths = new ArrayList<>();
		paths.add("/resources/image.png");
		paths.add("/resources/image2.png");
		Product product1 = new Product(1, "Tyrion Gnomister", "The popular character from the hit TV Show Game of Gnomes", 10001, paths, false);
		Product product2 = new Product(2, "Santa Gnome", "A festive Santa Gnome for your Christmas garden", 10002, paths, false);
		Product product3 = new Product(3, "Gimli Gnome", "A dwarven Gnome from the hit movie Lord of the Gnomes", 10003, paths, false);
		Product product4 = new Product(4, "Sleepy Gnome", "One of the Seven Gnomes", 10004, paths, false);
		Product product5 = new Product(5, "Dopey Gnome", "One of the Seven Gnomes", 10005, paths, false);
		Product product6 = new Product(6, "Sneezy Gnome", "One of the Seven Gnomes", 10006, paths, false);
		Product product7 = new Product(7, "Happy Gnome", "One of the Seven Gnomes", 10007, paths, false);
		Product product8 = new Product(8, "Doc Gnome", "One of the Seven Gnomes", 10008, paths, false);
		
		
		
		Stock stock1 = new Stock();
		Customer customer1 = new Customer();
		
		//addresses.add(address1);
		stock.add(stock1);
		customers.add(customer1);

	}

	public List<Supplier> getSuppliers(){
		return this.suppliers;
	}

	public void setSuppliers(List<Supplier> suppliers){
		this.suppliers = suppliers;
	}

	public List<StockOrder> getStockOrders(){
		return this.stockOrders;
	}

	public void setStockOrders(List<StockOrder> stockOrders){
		this.stockOrders = stockOrders;
	}


	public List<Product> getProducts(){
		return this.products;
	}

	public void setProducts(List<Product> products){
		this.products = products;
	}

	public List<Payment> getPayments(){
		return this.payments;
	}

	public void setPayments(List<Payment> payments){
		this.payments = payments;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public List<Basket> getBaskets(){
		return this.baskets;
	}

	public List<OrderLine> getOrderLines(){
		return this.orderLines;
	}

	public void setOrderLines(List<OrderLine> orderLines){
		this.orderLines = orderLines;
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

	public void setBaskets(List<Basket> baskets){
		this.baskets = baskets;
	}
}
