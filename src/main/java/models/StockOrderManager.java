package models;
/**
 * Created by Luke on 19/11/2016.
 */
public interface StockOrderManager {

    StockOrder createStockOrder(StockOrder stockOrder);

    StockOrder findById(int id);

    void updateStockOrder();

    void deleteStockOrder(StockOrder stockOrder);


}
