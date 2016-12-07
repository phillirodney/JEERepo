package models;
/**
 * This is the address model
 * 
 * @author Lewis
 * @Version 1.0
 * @since 2016-09-14
 * 
 * */

import java.util.ArrayList;
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

	@Column(name = "phoneNumber", nullable = false, length = 225)
	@Size(max = 225)
	@NotNull
	private String phoneNumber;

	@Column(name = "password", nullable = false, length = 225)
	@Size(max = 225)
	@NotNull
	private String password;

	@Column(name = "date_of_birth", nullable = false)
	@Type(type = "date")
	@NotNull
	private Date dateOfBirth;

	@ManyToMany
	@JoinTable(name = "has_address", joinColumns = @JoinColumn(name = "customer_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "address_id", referencedColumnName = "address_id"))
	private Address addresses;

	@OneToMany(mappedBy = "customer")
	private List<Basket> baskets;

	@OneToMany(mappedBy = "customer")
	private Payment payment;

	private List<CustomerOrder> orders;

	public Customer() {

	}

	public Customer(long id, String firstName, String lastName, String email, String phoneNumber, String password,
			Date dateOfBirth) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.password = password;
		this.dateOfBirth = dateOfBirth;

	}
	public Customer(String name, String email, String phone, String password) {
		this.firstName = name;
		this.email = email;
		this.password = password;
		this.baskets = new ArrayList<>();
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

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getPassword() {
		return password;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public Address getAddresses() {
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
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public void setAddresses(Address addresses) {
		this.addresses = addresses;
	}

	public void setBaskets(List<Basket> baskets) {
		this.baskets = baskets;
	}

	public List<CustomerOrder> getOrders() {
		return this.orders;
	}

	public void setOrders(List<CustomerOrder> orders) {
		this.orders = orders;
	}

}
