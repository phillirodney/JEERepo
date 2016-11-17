import javax.persistence.Entity;
import javax.persistence.Table;

@Entity 
@Table (name = "baskets")
public class Basket extends Product{
	
	public Basket(int productId, String name, int quantity, long stockId, String stockRequired,
			String stockReserved, String currentStock, Boolean porousware) {
		super(quantity, currentStock, quantity, stockId, currentStock, currentStock, currentStock, porousware);
	}
}