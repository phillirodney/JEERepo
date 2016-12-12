package models;

import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.*;

import org.hibernate.annotations.Type;
/**
 * This is the address model
 * 
 * @author Lewis
 * @Version 1.0
 * @since 2016-09-14
 * 
 * */
@Entity
@Table(name = "customer_orders")
public class CustomerOrder {

	@Id
	@Column(name = "customer_order_id", nullable = false, unique = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "total", nullable = false)
	@NotNull
	private Double total;

	@Column(name = "date", nullable = false)
	@Type(type = "date")
	@NotNull
	private Date dateOfOrder;

	@Column(name = "dispatch_status", nullable = false, length = 225)
	@Size(max = 225)
	@NotNull
	private String dispatchStatus;

	@Column(name = "payment_status", nullable = false, length = 225)
	@Size(max = 225)
	@NotNull
	private String paymentStatus;

	@OneToMany(mappedBy = "customer_orders")
	private List<OrderLine> orderLines;
	
	//Need to set the database value;
	private Customer customer;

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public CustomerOrder() {
		
		orderLines = new ArrayList<OrderLine>();
		dateOfOrder = new Date();
		dispatchStatus = "Dispatched";
		

	}

	public CustomerOrder(long id, Double total, Date dateOfOrder, String dispatchStatus, String paymentStatus, Customer customer) {
		this.id = id;
		this.total = total;
		this.dateOfOrder = dateOfOrder;
		this.dispatchStatus = dispatchStatus;
		this.paymentStatus = paymentStatus;
		this.orderLines = new ArrayList<>();
		this.customer = customer;

	}

	public long getId() {
		return id;

	}

	public void setId(long id){
		this.id = id;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public Date getDateOfOrder() {
		return dateOfOrder;
	}

	public void setDateOfOrder(Date dateOfOrder) {
		this.dateOfOrder = dateOfOrder; 
	}

	public String getDispatchStatus() {
		return dispatchStatus;
	}

	public void setDispatchStatus(String dispatchStatus) {
		this.dispatchStatus = dispatchStatus;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public List<OrderLine> getOrderLines() {
		return orderLines;
	}

	public void setOrderLines(List<OrderLine> orderLines){
		this.orderLines = orderLines;
	}
}
