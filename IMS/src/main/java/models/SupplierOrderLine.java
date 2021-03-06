package models;


import javax.persistence.*;
/**

 * @author Philli

 * */

@Entity
@Table (name = "supplier_order_lines")
public class SupplierOrderLine {
	
	@Id
	@GeneratedValue
	@Column (name = "supplier_order_line_id")
	private int supplierOrderLineId;


	@OneToMany
	@JoinColumn(name="product_id")
	private Product product;


	@OneToMany
	@JoinColumn(name="suppliler_order_id")
	private StockOrder stockOrder;
	
	private int quantity;

	public SupplierOrderLine() { 
	}


	public SupplierOrderLine(int quantity, Product product){
		
		this.setQuantity(quantity);
		this.product = product;
		
	}

	public int getSupplierOrderLineId() {
		return supplierOrderLineId;
}

	public void setSupplierOrderLineId(int lineId){
		this.supplierOrderLineId = lineId;
}

	public Product getProduct(){
		return product;
}

	public void setProduct(Product product) {
		 this.product = product;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}