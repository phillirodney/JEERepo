
public class CustomerOrder {

	private long id;
	private Double total;
	private Date dateOfOrder;
	private String dispatchStatus;
	private String paymentStatus;

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
}
