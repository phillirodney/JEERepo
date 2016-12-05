package models;

import java.util.List;

/*
 * @author Cieran
 * @autor Philli
 * 
 */

public interface ProductManager {

    Product createProduct(Product product);

    Product findById(int id);

    void updateProduct();

    void deleteProduct(Product product);
    
    List<Product> findByName(String name);
    
    List<Product> findByDescription(String description);
    

}
