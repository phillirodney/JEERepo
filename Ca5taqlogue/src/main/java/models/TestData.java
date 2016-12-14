package models;

import java.sql.Date;
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
	private List<SupplierOrderLine> supplierOrderLines;
	
	


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
		supplierOrderLines = new ArrayList<SupplierOrderLine>();

		// AddData
		// Address address1 = new Address(null, 0, null, null, null);
		Address address1 = new Address(1, 123, "Fake Street", "Springfield", "SP10 8RT");
		Address address2 = new Address(2, 666, "1st Avenue", "Hometown", "NYC 10");
		Address address3 = new Address(3, 100, "Snake Way", "Jonestown", "SW90 SRT");
		Address address4 = new Address(4, 345, "Basic Close", "Basictown", "BSC1 RTY");
		Address address5 = new Address(5, 742, "Evergreen Terrace", "Springfield", "SP11 EGT");
		Address address6 = new Address(6, 10, "Downing Street", "London", "LDN 10");
		Address address7 = new Address(7, 888, "Some Street", "Sometown", "SMPC ODE");
		Address address8 = new Address(8, 777, "Luke Street", "Teamthree", "TM3 LKE");

		// Product product1 = new Product(1, "Gnome1", 10, 1, null, null, null,
		// null);
		
		Stock stock1 = new Stock(1, 100, 120, 50, false);
		Stock stock2 = new Stock(2, 120, 140, 70, false);
		Stock stock3 = new Stock(3, 130, 150, 60, false);
		Stock stock4 = new Stock(4, 149, 169, 80, false);
		Stock stock5 = new Stock(5, 156, 176, 75, false);
		Stock stock6 = new Stock(6, 176, 196, 95, false);
		Stock stock7 = new Stock(7, 177, 197, 98, false);
		Stock stock8 = new Stock(8, 189, 209, 100, false);
		
		
		
		List<String> paths = new ArrayList<>();
		paths.add("/resources/image.png");
		paths.add("/resources/image2.png");
		Product product1 = new Product(1, "Tyrion Gnomister",
				"The popular character from the hit TV Show Game of Gnomes", 100, stock1, stock2, 120, 80, 4, paths, "Pot");
		Product product2 = new Product(2, "Santa Gnome", "A festive Santa Gnome for your Christmas garden", 23.99,
				stock3, stock4, 120, 80, 4, paths, "Leather");
		Product product3 = new Product(3, "Gimli Gnome", "A dwarven Gnome from the hit movie Lord of the Gnomes", 24.99,
				stock5, stock6, 120, 80, 4, paths, "Pot");
		Product product4 = new Product(4, "Sleepy Gnome", "One of the Seven Gnomes", 200, stock7, stock8, 120, 80, 4, paths, "China");
		Product product5 = new Product(5, "Dopey Gnome", "One of the Seven Gnomes", 300, stock1, stock2, 120, 80, 4, paths, "China");
		Product product6 = new Product(6, "Sneezy Gnome", "One of the Seven Gnomes", 400, stock3, stock4, 120, 80, 4, paths, "China");
		Product product7 = new Product(7, "Happy Gnome", "One of the Seven Gnomes", 500, stock5, stock6, 120, 80, 4, paths, "Leather");
		Product product8 = new Product(8, "Doc Gnome", "One of the Seven Gnomes", 600, stock7, stock8, 120, 80, 4, paths, "Pot");

	
		SupplierOrderLine sol = new SupplierOrderLine(1, product1);
		SupplierOrderLine sol2 = new SupplierOrderLine(2, product2);
		SupplierOrderLine sol3 = new SupplierOrderLine(3, product3);
		List<SupplierOrderLine> orderlines = new ArrayList<>();
		orderlines.add(sol);
		orderlines.add(sol2);
		orderlines.add(sol3);
		
		
		

		StockOrder stockOrder1 = new StockOrder(1, orderlines);
		StockOrder stockOrder2 = new StockOrder(2, orderlines);
		StockOrder stockOrder3 = new StockOrder(3, orderlines);
		StockOrder stockOrder4 = new StockOrder(4, orderlines);
		StockOrder stockOrder5 = new StockOrder(5, orderlines);
		StockOrder stockOrder6 = new StockOrder(6, orderlines);
		StockOrder stockOrder7 = new StockOrder(7, orderlines);
		StockOrder stockOrder8 = new StockOrder(8, orderlines);

		List<StockOrder> stockOrders = new ArrayList<StockOrder>();
		
		stockOrders.add(stockOrder1);
		stockOrders.add(stockOrder2);
		stockOrders.add(stockOrder3);
		stockOrders.add(stockOrder4);
		stockOrders.add(stockOrder5);
		stockOrders.add(stockOrder6);
		stockOrders.add(stockOrder7);
		stockOrders.add(stockOrder8);

		
		
		Customer customer1 = new Customer(1, "Jason", "Bourne", "jasonbourne@gmail.com", "01234567899", "pass",
				new Date(0));
		Customer customer2 = new Customer(2, "Beauty", "Beauty", "blackbeauty@gmail.com", "01234567899", "pass",
				new Date(0));
		Customer customer3 = new Customer(3, "Lisa", "Simpson", "lisasimpson@gmail.com", "01234567899", "pass",
				new Date(0));
		Customer customer4 = new Customer(4, "Moe", "Szyslak", "moeszyslak@gmail.com", "01234567899", "pass",
				new Date(0));
		Customer customer5 = new Customer(5, "Dwayne", "Johnson", "dwaynejohnson@gmail.com", "01234567899", "pass",
				new Date(0));
		Customer customer6 = new Customer(6, "Tom", "Cruise", "tomcruise@gmail.com", "01234567899", "pass",
				new Date(0));

		Payment payment1 = new Payment("4550-5006-9789-2345", address1, new Date(0), "Jason Bourner", 123);
		
		CustomerOrder corder = new CustomerOrder(1, 200.0, new Date(0), "Dispatched", "payed", customer1);
		CustomerOrder corder1 = new CustomerOrder(2, 200.0, new Date(0), "Dispatched", "payed", customer1);
		CustomerOrder corder2 = new CustomerOrder(3, 200.0, new Date(0), "Dispatched", "payed", customer1);
		CustomerOrder corder3 = new CustomerOrder(4, 200.0, new Date(0), "Dispatched", "payed", customer1);
		CustomerOrder corder4 = new CustomerOrder(5, 200.0, new Date(0), "Dispatched", "payed", customer1);

		
		List<CustomerOrder> orders = new ArrayList<CustomerOrder>();
		orders.add(corder);
		orders.add(corder1);
		orders.add(corder2);
		orders.add(corder3);
		orders.add(corder4);
		
		OrderLine ol = new OrderLine(1, product1, 2);
		
		corder.getOrderLines().add(ol);

		customer1.setPayment(payment1);
		customer1.setOrders(orders);
		customer1.setAddresses(address1);

		Basket basket = new Basket(1, 1, product1, new Date(0), customer1);
		List<Basket> baskets = new ArrayList<Basket>();

		payments.add(payment1);

		addresses.add(address1);
		addresses.add(address2);
		addresses.add(address4);
		addresses.add(address5);
		addresses.add(address6);
		addresses.add(address7);
		addresses.add(address8);

		products.add(product1);
		products.add(product2);
		products.add(product3);
		products.add(product4);
		products.add(product5);
		products.add(product6);
		products.add(product7);
		products.add(product8);

		stock.add(stock1);
		stock.add(stock2);
		stock.add(stock3);
		stock.add(stock4);
		stock.add(stock5);
		stock.add(stock6);
		stock.add(stock7);
		stock.add(stock8);

		customers.add(customer1);
		customers.add(customer2);
		customers.add(customer3);
		customers.add(customer4);
		customers.add(customer5);
		customers.add(customer6);
		
		customerOrders.add(corder);
		customerOrders.add(corder1);
		customerOrders.add(corder2);
		customerOrders.add(corder3);
		customerOrders.add(corder4);


	}

	public List<Supplier> getSuppliers() {
		return this.suppliers;
	}

	public void setSuppliers(List<Supplier> suppliers) {
		this.suppliers = suppliers;
	}

	public List<StockOrder> getStockOrders() {
		return this.stockOrders;
	}

	public void setStockOrders(List<StockOrder> stockOrders) {
		this.stockOrders = stockOrders;
	}

	public List<Product> getProducts() {
		return this.products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public List<Payment> getPayments() {
		return this.payments;
	}

	public void setPayments(List<Payment> payments) {
		this.payments = payments;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public List<Basket> getBaskets() {
		return this.baskets;
	}

	public List<OrderLine> getOrderLines() {
		return this.orderLines;
	}

	public void setOrderLines(List<OrderLine> orderLines) {
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

	public void setBaskets(List<Basket> baskets) {
		this.baskets = baskets;
	}

	public List<SupplierOrderLine> getSupplierOrderLines() {
		return this.supplierOrderLines;
	}

	public void setSupplierOrderLines(List<SupplierOrderLine> supplierOrderLine) {
		this.supplierOrderLines = supplierOrderLines;
	}

}
