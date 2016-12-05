package models;

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

}
