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
	@Column (name = "line_id")
	private int lineId;


	@OneToMany
	@JoinColumn(name="product_id")
	private Product product;


	@OneToMany
	@JoinColumn(name="suppliler_order_id")
	private StockOrder stockOrder;

	public SupplierOrderLine() { 
	}

	public SupplierOrderLine(int lineId, Product product){
		this.lineId = lineId;
		this.product = product;
	}

	public int getLineId() {
		return lineId;
}

	public void setLineId(int lineId){
		this.lineId = lineId;
}

	public Product getProduct(){
		return product;
}

	public void setProduct(Product product) {
		 this.product = product;
	}

}