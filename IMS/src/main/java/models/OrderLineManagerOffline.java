package models;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;
import java.util.List;
/**
 * This is the address model
 * 
 * @author Cieran
 * @author Philli
 * @Version 1.0
 * @since 2016-09-14
 * 
 * */
@Stateless
@Default
public class OrderLineManagerOffline implements OrderLineManager {


    @Inject
    private TestData testData;


    @Override
    public OrderLine createOrderLine(OrderLine orderLine) {

        List<OrderLine>  orderLines = testData.getOrderLines();
        orderLine.setLineId(orderLines.size() + 1);
        testData.setOrderLines(orderLines);
        return findById(orderLine.getLineId());

    }

    @Override
    public OrderLine findById(int id) {

        for(OrderLine o: testData.getOrderLines()){
            if(o.getLineId() == id){
                return o;
            }
        }
        return null;
    }

    @Override
    public OrderLine updateOrderLine(OrderLine orderLine) {
		return orderLine;
    	// no operation - for an in-memory

    	// database,

    	// we update automatically in real time
    }

    @Override
    public void deleteOrderLine(OrderLine orderLine) {


        List<OrderLine> orderLines = testData.getOrderLines();
        for(OrderLine o: orderLines){
            if(o.getLineId() == orderLine.getLineId()){
                orderLines.remove(o);
                break;
            }
        }
        for(OrderLine o: orderLines){
            if(o.getLineId() > orderLine.getLineId()){
                o.setLineId(o.getLineId() - 1);
            }
        }

        testData.setOrderLines(orderLines);


    }
}
