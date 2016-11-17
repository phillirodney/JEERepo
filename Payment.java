
public class Payment {

	private String cardNumber;
	private Address address;

	public Payment() {

	}

	public Payment(String CardNumber, Address address) {

		this.CardNumber = CardNumber;
		this.address = address;

	}

	public String getCardNumber(){
		return CardNumber
	}

	public void setCardNumber(String CardNumber) {
		this.CardNumber = CardNumber;
	}

	public Address getAddress() {
		return address;

	}

	public void setAddress(Address addess) {
		this.address = address;
	}

}
