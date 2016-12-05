package models;
import javax.inject.Inject;
import java.util.List;

/**
 * Created by Luke on 19/11/2016.
 * @author Cieran
 * @author Philli
 */
public class ProductManagerOffline implements ProductManager {

    @Inject
    private TestData testData;

    @Override
    public Product createProduct(Product product) {

        List<Product> products = testData.getProducts();
        product.setproductId(products.size() + 1);
        testData.setProducts(products);
        return findById(product.getproductId());

    }

    @Override
    public Product findById(int id) {

        for(Product p: testData.getProducts()){
            if(p.getproductId() == id){
                return p;
            }
        }


        return null;
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
}
