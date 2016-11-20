import javax.inject.Inject;
import java.util.List;

/**
 * Created by Luke on 19/11/2016.
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


    }

    @Override
    public void deleteStockOrder(StockOrder stockOrder) {
        

    }
}
