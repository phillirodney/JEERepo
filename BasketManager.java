
public interface BasketManager extends Customer{
	
	//List<Products> basket = new ArrayList<Products>();

	public Basket createBasket(int productId, String name, int quantity, long stockID, String stockRequired,
			String stockReserved, String currentStock, Boolean porousware, int customerId);

	public Ba

}
