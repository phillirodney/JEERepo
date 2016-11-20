
public interface ProductManager {

    Product createProduct(Product product);

    Product findById(Product product);

    void updateProduct();

    void deleteProduct();

}
