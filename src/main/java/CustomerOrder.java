
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.*;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "customer_orders")
public class CustomerOrder {

	@Id
	@Column(name = "id", nullable = false, unique = true)
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

	@OneToMany

	@JoinColumn(name = "customer_order_id", referencedColumnName = "id", nullable = false)
	
	@NotNull
	private List<OrderLine> orderLines;

	public CustomerOrder() {

	}

	public CustomerOrder(long id, Double total, Date dateOfOrder, String dispatchStatus, String paymentStatus) {
		this.id = id;
		this.total = total;
		this.dateOfOrder = dateOfOrder;
		this.dispatchStatus = dispatchStatus;
		this.paymentStatus = paymentStatus;

	}

	public long getId() {
		return id;

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