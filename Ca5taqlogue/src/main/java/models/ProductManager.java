package models;

import java.util.List;

/*
 * @author Cieran
 * @autor Philli
 * 
 */

public interface ProductManager {

    Product createProduct(Product product);

    Product findProductById(int id);

    void updateProduct();

    void deleteProduct(Product product);
    
    List<Product> findProductByName(String name);
    
    List<Product> findProductByDescription(String description);
    
    List<Product> returnAll();
    
    List<Product> findbyMaterial(String material);

}
