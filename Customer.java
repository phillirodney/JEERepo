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
	@JoinTable(name = "has_address", joinColumns = @JoinColumn(name = "customers_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "address_id", referencedColumnName = "id"))
	private List<Address> addresses;
	
	
	@ManyToMany
	@JoinTable(name = "basket_had_product", joinColumns = @joinColumn(name = "customer_id", referenceColumnName = "id"), inverseJoinColumns = @joinColumn(name = "product_id", referencedColumnName = "product_id"))
	private List<Basket> baskets;
	

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

	public long getId(){
		return id
	}

	public String getFirstName(){
		return firstName
	}

	public String setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName(){
		return lastName
	}

	public String setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail(){
		return email
	}

	public String setEmail(String email) {
		this.email = email;
	}

	public String getPassword(){
		return password
	}

	public String setPassword(String password) {
		this.password = password;
	}

	public Date getDateOfBirth(){
		return dateOfBirth
	}

	public String setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Address getAddresses() {
		return addresses;
	}

	public void setAddresses(String addresses){
		this.addresses = addresses
	}
}
