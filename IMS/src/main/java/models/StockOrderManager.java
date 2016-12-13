package models;

import java.util.List;

/**
 * @author Philli
 * @author Cieran
 */
public interface StockOrderManager {

    StockOrder createStockOrder(StockOrder stockOrder);

    StockOrder findById(int id);

    void updateStockOrder();

    void deleteStockOrder(StockOrder stockOrder);
    
    List<StockOrder> returnAll();


}
