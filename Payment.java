
public class Payment {

	private String cardNumber;
	private Address address;

	public Payment() {

	}

	public Payment(String cardNumber, Address address) {

		this.cardNumber = cardNumber;
		this.address = address;

	}

	public String getCardNumber(){
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public Address getAddress() {
		return address;

	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
