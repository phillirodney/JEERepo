/**
 * This is the address model
 * 
 * @author ....
 * @Version 1.0
 * @since 2016-09-14
 * 
 * */

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Type;


 
@Entity
@Table(name = "customers")
public class Customer {

	@Id
	@Column(name = "id", nullable = false, unique = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "first_name", nullable = false, length = 225)
	@Size(max = 225)
	@NotNull
	private String firstName;

	@Column(name = "last_name", nullable = false, length = 225)
	@Size(max = 225)
	@NotNull
	private String lastName;

	@Column(name = "email", nullable = false, length = 225)
	@Size(max = 225)
	@NotNull
	private String email;

	@Column(name = "password", nullable = false, length = 225)
	@Size(max = 225)
	@NotNull
	private String password;

	@Column(name = "date_of_birth", nullable = false)
	@Type(type = "date")
	@NotNull
	private Date dateOfBirth;

	@ManyToMany
	@JoinTable(name = "has_address",
			joinColumns =
				@JoinColumn(name = "customer_id", referencedColumnName = "id"),
			inverseJoinColumns =
				@JoinColumn(name = "address_id", referencedColumnName = "address_id"))
	private List<Address> addresses;

	@OneToMany(mappedBy = "customer")
	private List<Basket> baskets;


	@OneToMany(mappedBy = "customer")
	private List<Payment> payment;


	public Customer() {

	}

	public Customer(long id, String firstName, String lastName, String email, String password, Date dateOfBirth) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.dateOfBirth = dateOfBirth;

	}

	public long getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public List<Basket> getBaskets() {
		return baskets;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	public void setBaskets(List<Basket> baskets) {
		this.baskets = baskets;
	}

	
}
