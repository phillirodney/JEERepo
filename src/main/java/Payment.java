import javax.persistence.*;

public class Payment {



	@Id
	@Column(name = "card_number", nullable = false, unique = true)
	@GeneratedValue
	private String cardNumber;

	//Uni-Directional Relationship
	@ManyToOne
	@JoinColumn(name = "address_id")
	private Address address;


	@ManyToOne
	@JoinColumn(name= "customer_id")
	private Customer customer;

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
