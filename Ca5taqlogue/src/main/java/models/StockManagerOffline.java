package models;
import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;
import java.util.List;

/**
 * @author Luke
 * @author Hayley
 */
@Stateless
@Default
public class StockManagerOffline implements StockManager {


    @Inject
    private TestData testData;

    @Override
    public Stock createStock(Stock stock) {

        List<Stock> stocks = testData.getStock();
        stock.setStockId(stocks.size() - 1);
        stocks.add(stock);
        testData.setStock(stocks);
        return findByProductId(stock.getStockId());
    }


    @Override
    public Stock findByProductId(int productId) {

        for(Stock s: testData.getStock()){
            if(s.getStockId() == productId){
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
            if(s.getStockId() == stock.getStockId()){
                stocks.remove(s);
                break;
            }
        }
        for(Stock s: testData.getStock()){
            if(s.getStockId() > stock.getStockId()){
                s.setStockId((s.getStockId() - 1));
            }
        }
        testData.setStock(stocks);
    }
}
