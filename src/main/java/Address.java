import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * 
 * @author Team
 */

@Entity
@Table(name = "addresses")

public class Address {

	@Id
	@GeneratedValue
	@Column (name = "address_id")
	private int addressId;
	
	@Column(name = "house_number", nullable=false)
	@NotNull
	private int houseNumber;
	
	@Column(name = "street", nullable=false, length=225)
	@Size(max=225)
	@NotNull
	private String street;
	
	@Column(name = "city", nullable=false, length=225)
	@Size(max=225)
	@NotNull
	private String city;
	
	@Column(name = "postcode", nullable=false, length=225)
	@Size(max=225)
	@NotNull
	private String postcode;

	public Address(int addressId, int houseNumber, String street, String city, String postcode) {

		this.addressId = addressId;
		this.houseNumber = houseNumber;
		this.street = street;
		this.city = city;
		this.postcode = postcode;

	}

	public int getaddressId() {
		return addressId;
	}
	
	public void setaddressId(int addressId)
	{
		this.addressId = addressId;
	}

	
	public int gethouseNumber() {
		return houseNumber;
	}

	public void sethouseNumber(int houseNumber) 
	{	
		this.houseNumber = houseNumber;
	}
	
	public String getstreet() {
		return street;
	}
	
	public void setstreet (String street) {
		this.street = street;
	}
	
	public String getcity() {
		return city;
	}
	
	public void setcity (String city) {
		this.city = city;
							
	}
	
	public String getpostcode()
	{
		return postcode;
	}
	
	public void setpostcode (String postcode)
	{
		this.postcode = postcode;	
	}
	
}
