/**
 * Created by Luke on 19/11/2016.
 */
public interface StockOrderManager {

    StockOrder createStockOrder();

    StockOrder findById();

    void updateStockOrder();

    void deleteStockOrder();


}
