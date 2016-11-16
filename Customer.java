
public class Customer {

	private long id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private Date dateOfBirth;
	private List<Address> addresses;

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
	
	public Address getAddresses(){
		return addresses;
	}
	
	public void setAddresses(String addresses){
		this.addresses = addresses
	}
}
