package models;
/**
 * This is the address model
 * 
 * @author Philli
 * @author Cieran
 * @Version 1.0
 * @since 2016-09-14
 * 
 * */
public interface OrderLineManager {

    OrderLine createOrderLine(OrderLine orderLine);

    OrderLine findById(int id);

    OrderLine updateOrderLine(OrderLine orderLine);

    void deleteOrderLine(OrderLine orderLine);

}
