package models;
/**
 * This is the address model
 * 
 * @author Luke 
 * @Version 1.0
 * @since 2016-09-14
 * 
 * */

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;
import java.util.List;

/* @author Luke */
 
@Stateless
@Default
public class BasketManagerOffline implements BasketManager {

    @Inject
    private TestData testData;

    @Override
    public Basket findById(int id) {
        for(Basket b: testData.getBaskets()){
            if(b.getBasket_id() == id){
                return b;
            }
        }
        return null;
    }

    @Override
    public List<Basket> findBasketsByCustomerId(int id) {
        for(Customer c: testData.getCustomers()){
            if(c.getId() == id){
                return c.getBaskets();
            }
        }
        return null;
    }

    @Override
    public Basket createBasket(Basket basket) {
        List<Basket>  baskets = testData.getBaskets();
        basket.setBasket_id(baskets.size() + 1);
        baskets.add(basket);
        testData.setBaskets(baskets);
        return findById(basket.getBasket_id());
    }

    @Override
    public void updateBasket(Basket basket) {

    	// no operation - for an in-memory

    	// database,

    	// we update automatically in real time

    }

    @Override
    public void deleteBasket(Basket basket) {

        List<Basket> baskets = testData.getBaskets();
        for(Basket b: baskets){
            if(b.getBasket_id() == basket.getBasket_id()) {
                baskets.remove(b);
                break;
            }
        }  
        testData.setBaskets(baskets);

    }
}
