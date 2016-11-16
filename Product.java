
public class Product {

	

	private String name;

	private int quantity;

	private long stockID;

	private String stockRequired;

	private String stockReserved;

	private String currentStock;

	private Boolean porousware;

	ArrayList<String> images = new ArrayList<String>();

	public Stock(String name, int quantity, long stockID, String stockRequired,
			String stockReserved, String currentStock, Boolean porousware) {

		this.name = name;
		this.quantity = quantity;
		this.stockID = stockID;
		this.stockRequired = stockRequired;
		this.stockReserved = stockReserved;
		this.currentStock = currentStock;
		this.porousware = porousware;

	}

	public String getname (){
		return name;
	}
		public void setname (String name) {
			this.name = name;
		}
			public int getquantity (){
				return quantity;
			}
				public void setquantity (int quantity) {
					this.quantity = quantity;
				}
					public long getstockID () {
						return stockID;
					}
						public void setstockID (long stockID) {
							this.stockID = stockID;
						}
							public String getstockRequired (){
								return stockRequired;
								
								public void setstockRequired (String stockRequired){
									this.stockRequired = stockRequired;
								}
									public String getstockReserved (){
										return stockReserved;
									}
									
									public void set stockReserved (String stockReserved){
										this.stockReserved = stockReserved;
									}
									 
									public String getcurrentStock () {
										return.currentStock;
									}
									
									public void setcurrentStock (String currentStock){
										this.currentStock = currentStock;
									}
									
									public Boolean getporousware (){
										return porousware;
										{
											public void setporousware (Boolean porousware){
												this.porousware = porousware;
											}
											
								
							}
						}
					}
				}
			}
		}
	}
	
	
}

}
