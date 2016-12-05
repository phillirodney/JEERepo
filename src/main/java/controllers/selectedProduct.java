package controllers;

/*
 * @author Luke
 * 
 */





@SessionScoped
@Named("selected")
public class selectedProduct implements Serializable{
	private static final long serialVersionUID = -1829473829473829;
	private Product product;
	
	public Product getProduct() {return product;}
	public void setProduct(ProductItem product){this.product = product;}
	

}
