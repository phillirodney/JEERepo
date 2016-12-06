package models;
import javax.inject.Inject;

import java.util.ArrayList;
import java.util.List;


import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

/**
 * Created by Luke on 19/11/2016.
 * @author Cieran
 * @author Philli
 */
@Stateless
@Default
public class ProductManagerOffline implements ProductManager {

    @Inject
    private TestData testData;

    @Override
    public Product createProduct(Product product) {

        List<Product> products = testData.getProducts();
        product.setproductId(products.size() + 1);
        testData.setProducts(products);
        return findProductById(product.getproductId());

    }

    @Override
    public Product findProductById(int id) {

        for(Product p: testData.getProducts()){
            if(p.getproductId() == id){
                return p;
            }
        }
        
        return null;
    }
    
    
    @Override
    public List<Product> findProductByName(String name){
    	
    	List<Product> products = new ArrayList<>();
    	for(Product p: products) {
    		if(p.getname().contains(name)) {
    			products.add(p);
    			
    		}
    	}
    	return products;
    	
    }
    
    @Override
    public List<Product> findProductByDescription(String description){
    	List<Product> products = new ArrayList<>();
    	for(Product p: products) {
    		if(p.getDescription().contains(description)) {
    			products.add(p);
    		}
    	}
    	return products;
    }
    

    @Override
    public void updateProduct() {
    	
    	// no operation - for an in-memory

    	// database,

    	// we update automatically in real time

    }

    @Override
    public void deleteProduct(Product product) {

        List<Product> products = testData.getProducts();

        for(Product p: products){
            if(p.getproductId() == product.getproductId()){
                products.remove(p);
            }
        }

        for(Product p: products){
            if(p.getproductId() > product.getproductId()){
                p.setproductId(p.getproductId() - 1);
            }
        }

    }
    
    @Override
    public List<Product> returnAll(){
    	return testData.getProducts();
    }
}
