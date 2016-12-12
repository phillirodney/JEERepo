package models;

/*
 * @author Lewis
 */

public interface PaymentsManager {

	// create a new payment method
	public Payment createNewPayment(Payment payment);

	// update a payment method
	public void updatePayment(Payment payment);

	// delete a payment method
	public void deletePayment(Payment payment);

	Payment findByCardNumber(String cardNumber);

}
