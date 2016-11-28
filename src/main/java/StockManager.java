
public interface StockManager {
	
	//CRUD
	
	//C
	
	public Stock createStock(Stock stock);
	
	
	//R

	public Stock findByProductId(int productId);
	
	//U
	
	public void updateStock(Stock stock);
	
	//D
	
	public void deleteStock(Stock stock);
	

}
