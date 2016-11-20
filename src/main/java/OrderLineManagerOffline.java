import javax.inject.Inject;
import javax.persistence.criteria.Order;
import java.util.List;

/**
 * Created by Luke on 19/11/2016.
 */
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
        return null;
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
