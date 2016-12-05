package models;
import javax.inject.Inject;
import java.util.List;

/**
 * @author Hayley
 * @author Luke
 */

public class StockerOrderManagerOffline implements StockOrderManager {

    @Inject
    private TestData testData;

    @Override
    public StockOrder createStockOrder(StockOrder stockOrder) {

        List<StockOrder> stockOrders = testData.getStockOrders();

        stockOrder.setsOrderID(stockOrders.size() + 1);
        stockOrders.add(stockOrder);
        testData.setStockOrders(stockOrders);

        return findById(stockOrder.getstockOrderID());
    }

    @Override
    public StockOrder findById(int id) {

        for(StockOrder so: testData.getStockOrders()){
            if(so.getstockOrderID() == id){
                return so;
            }
        }

        return null;
    }

    @Override
    public void updateStockOrder() {

    	// no operation - for an in-memory

    	// database,

    	// we update automatically in real time

    }

    @Override
    public void deleteStockOrder(StockOrder stockOrder) {

        List<StockOrder> stockOrders = testData.getStockOrders();
        for(StockOrder so: stockOrders){
            if(so.getstockOrderID() == stockOrder.getstockOrderID()){
                stockOrders.remove(so);
                break;
            }
        }
        for(StockOrder so: stockOrders){
            if(so.getstockOrderID() > stockOrder.getstockOrderID()){
                so.setsOrderID(so.getstockOrderID() - 1 );
            }
        }
        testData.setStockOrders(stockOrders);


    }
}
