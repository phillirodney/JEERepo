
public interface PaymentsManager {
	// create a new payment method
	public PaymentsManager createNewPayment(PaymentsManager payment);

	// update a payment method
	public void updatePayment(PaymentsManager payment);

	// delete a payment method
	public void deletePayment(PaymentsManager payment);

}
