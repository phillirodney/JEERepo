/**
 * Created by Luke on 19/11/2016.
 */
public interface OrderLineManager {

    OrderLine createOrderLine(OrderLine orderLine);

    OrderLine findById(int id);

    OrderLine updateOrderLine(OrderLine orderLine);

    void deleteOrderLine(OrderLine orderLine);

}
