@Entity
@Table(name = "customer_orders")
public class CustomerOrder {

	@Id
	@Column(name = "id", nullable = false, unique = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "total", nullable = false)
	@NotNull
	private int total;

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
	@InverseJoinColumn(name = "customer_order_id", nullable = false)
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

	public long getId(){
		return id
	}

	public Double getTotal() {
		return total;
	}

	public Double setTotal(Double total) {
		this.total = total;
	}

	public Date getDateOfOrder() {
		return date;
	}

	public Double setDateOfOrder(Date dateOfOrder) {
		this.dateOfOrder = dateOfOrder;
	}

	public String getDispatchStatus() {
		return dispatchStatus;
	}

	public String setDispatchStatus(String dispatchStatus) {
		this.dispatchStatus = dispatchStatus;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public String setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public OrderLine getOrderLines() {
		return orderLines;
	}

	public void setOrderLines(String orderLines){
		this.orderLines = orderLines
	}
}
