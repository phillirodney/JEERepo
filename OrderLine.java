import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name = "order_lines")
public class OrderLine {
	
	@lineId @GeneratedValue
	@Column (name = "line_id")
	private int lineId;
	
	@Column (name = "product_id")
	private int productId;

	public OrderLine() { 
	}

	public OrderLine( int lineId, int productId){
		this.lineId = lineId;
		this.productId = productId;
	}

	public int getLineId() {
		return lineId;
}

	public void setLineId(int lineId){
		this.lineId = lineId;
}

	public int getProductId(){
		return productId;
}

	public int setProductId(int productId) {
		this.productId = productId;
	}

}