package models;



import javax.persistence.*;
import java.sql.Date;

/**
 * This is the address model
 * 
 * @author Philli
 * @author Cieran 
 * @Version 1.0
 * @since 2016-09-14
 * 
 * */
 


@Entity 
@Table (name = "baskets")
public class Basket {

	@Id
	@Column(name="id", nullable=false, unique=true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int basket_id;

	@Column(name="quantity")
	private int quantity;

	@OneToOne
	@JoinColumn(name="product_id")
	private Product product;

	@Column(name="date")
	private Date date;

	@ManyToOne
	@JoinColumn(name="customer_id")
	private Customer customer;

	public Basket(){

	}

	public int getBasket_id(){
		return this.basket_id;
	}

	public int getQuantity(){
		return this.quantity;
	}

	public Product getProduct(){
		return this.product;
	}

	public Date getDate(){
		return this.date;
	}

	public void setQuantity(int quantity){
		this.quantity = quantity;
	}

	public void setProduct(Product product){
		this.product = product;
	}

	public void setDate(Date date){
		this.date = date;
	}

	public void setBasket_id(int basket_id){
		this.basket_id = basket_id;
	}

}