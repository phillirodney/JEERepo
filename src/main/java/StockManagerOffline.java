import javax.inject.Inject;
import java.util.List;

/**
 * Created by Luke on 19/11/2016.
 */
public class StockManagerOffline implements StockManager {


    @Inject
    private TestData testData;

    @Override
    public Stock createStock(Stock stock) {

        List<Stock> stocks = testData.getStock();
        stock.setProductId(stocks.size() - 1);
        stocks.add(stock);
        testData.setStock(stocks);
        return findByProductId(stock.getProductId());
    }


    @Override
    public Stock findByProductId(int productId) {

        for(Stock s: testData.getStock()){
            if(s.getProductId() == productId){
                return s;
            }
        }
        return null;
    }

    @Override
    public void updateStock(Stock stock) {
    	
    	// no operation - for an in-memory

    	// database,

    	// we update automatically in real time

    }

    @Override
    public void deleteStock(Stock stock) {

        List<Stock> stocks = testData.getStock();
        for(Stock s: testData.getStock()){
            if(s.getProductId() == stock.getProductId()){
                stocks.remove(s);
                break;
            }
        }
        for(Stock s: testData.getStock()){
            if(s.getProductId() > stock.getProductId()){
                s.setProductId((s.getProductId() - 1));
            }
        }
        testData.setStock(stocks);
    }
}
