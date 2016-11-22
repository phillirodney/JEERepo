

import javax.persistence.*;
/**
 * This is the address model
 * 
 * @author ....
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


	@OneToMany
	@JoinColumn(name="customer_order_id")
	private CustomerOrder customerOrder;

	public OrderLine() { 
	}

	public OrderLine(int lineId, Product product){
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