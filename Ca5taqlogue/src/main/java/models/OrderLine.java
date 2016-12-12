package models;


import javax.persistence.*;
/**
 * This is the address model
 * 
 * @author Cieran
 * @author Philli
 * @Version 1.0
 * @since 2016-09-14
 * 
 * */

@Entity
@Table (name = "order_lines")
public class OrderLine {
	
	@Id
	@GeneratedValue
	@Column (name = "line_id")
	private int lineId;


	@OneToMany
	@JoinColumn(name="product_id")
	private Product product;
	
	@Column(name="quantity")
	private int quantity;


	@OneToMany
	@JoinColumn(name="customer_order_id")
	private CustomerOrder customerOrder;

	public OrderLine() { 
		
		
	}

	public OrderLine(int lineId, Product product, int quantity){
		this.lineId = lineId;
		this.product = product;
		this.quantity = quantity;
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
	
	public int getQuantity(){
		return this.quantity;
	}
	
	public void setQuantity(int quantity){
		this.quantity = quantity;
	}

}