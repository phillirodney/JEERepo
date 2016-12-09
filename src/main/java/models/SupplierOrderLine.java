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

<<<<<<< HEAD
	public SupplierOrderLine(int quantity, Product product, StockOrder stockOrder){
		
		this.quantity = quantity;
=======
	
	public SupplierOrderLine(int supplierOrderLineId, Product product){
		this.supplierOrderLineId = supplierOrderLineId;
>>>>>>> be5e7bd476908c944ca07fc757aa54e77692d2d1
		this.product = product;
		this.stockOrder = stockOrder;
		
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

}