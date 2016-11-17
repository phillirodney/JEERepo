import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class Product {

	@productId @GeneratedValue
	@Column(name = "product_id")
	private int productId;

	@Column(name = "name")
	private String proudctName;

	@Column(name = "quantity")
	private int quantity;
	
	@Column(name = "stock_id")
	private long stockId;
	
	@Column(name = "stock_required")
	private String stockRequired;

	@Column(name = "stock_reserved")
	private String stockReserved;
	
	@Column(name = "current_stock")
	private String currentStock;
	
	@Column(name = "porousware")
	private Boolean porousware;

	ArrayList<String> images = new ArrayList<String>();

	public Stock(int productId, String proudctName, int quantity, long stockID, String stockRequired,
			String stockReserved, String currentStock, Boolean porousware) {

		this.productId = productId;
		this.proudctName = proudctName;
		this.quantity = quantity;
		this.stockID = stockID;
		this.stockRequired = stockRequired;
		this.stockReserved = stockReserved;
		this.currentStock = currentStock;
		this.porousware = porousware;

	}

	public int getproductId(int productId) {
		return productId;
	}

	public void setproductId() {
		this.productId = productId;
	}

	public String getproudctName() {
		return proudctName;
	}

	public void setproudctName(String proudctName) {
		this.proudctName = proudctName;
	}

	public int getquantity() {
		return quantity;
	}

	public void setquantity(int quantity) {
		this.quantity = quantity;
	}

	public long getstockID() {
		return stockID;
	}

	public void setstockID(long stockID) {
		this.stockID = stockID;
	}

	public String getstockRequired (){
								return stockRequired;

	public void setstockRequired(String stockRequired) {
		this.stockRequired = stockRequired;
	}

	public String getstockReserved() {
		return stockReserved;
	}

	public void set

	stockReserved (String stockReserved){
										this.stockReserved = stockReserved;
									}

	public String getcurrentStock () {
										return.currentStock;
									}

	public void setcurrentStock(String currentStock) {
		this.currentStock = currentStock;
	}

	public Boolean getporousware (){
										return porousware;
										{

	public void setporousware(Boolean porousware) {
		this.porousware = porousware;
	}

}}}}}}}

}

}
