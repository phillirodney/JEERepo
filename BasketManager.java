
public interface BasketManager extends Customer {

	// List<Products> basket = new ArrayList<Products>();

	public Basket createBasket(int productId, String proudctName, int quantity, long stockID, String stockRequired,
			String stockReserved, String currentStock, Boolean porousware, int customerId);

	// Find by customerId
	public List<Products> findByCustomerId(int customerId);

	// Find by customer firstName
	public List<Products> findByCustomerFirstName(String firstName);

	// Find by customer lastName
	public List<Products> findByCustomerLastName(String lastName);

	// Update / Edit Basket
	public void updateBasketByProduct(int productId, String productName);

	// Update basket with porousware
	public void updateBasketByPorousware(boolean porousware);
	
	// Update basket with product quantity
	public void updateBasketByQuantity(int quantity);
}
