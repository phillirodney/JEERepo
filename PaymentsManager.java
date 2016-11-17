
public interface PaymentsManager {
	// create a new payment method
	public PaymentsManager createNewPayment(PaymentsManager payment);

	// update a payment method
	public PaymentsManager updatePayment(PaymentsManager payment);

	// delete a payment method
	public PaymentsManager deletePayment(PaymentsManager payment);

}
