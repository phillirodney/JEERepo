
public interface StockManager {
	
	//CRUD
	
	//C
	
	public void createStock(Stock stock);
	
	
	//R
	
	public Stock findByStockId(int stockId);
	
	public Stock findByProductId(int productId);
	
	//U
	
	public void updateStock(Stock stock);
	
	//D
	
	public void deleteStock(Stock stock);
	

}
