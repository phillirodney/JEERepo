/**
 * This is the address model
 * 
 * @author ....
 * @Version 1.0
 * @since 2016-09-14
 * 
 */


import java.util.*;

 

public interface BasketManager{


	 Basket findById(int id);

	 List<Basket> findBasketsByCustomerId(int id);

	 Basket createBasket(Basket basket);

	 void updateBasket(Basket basket);

	 void deleteBasket(Basket basket);

	//Possibly create a delete which takes the ID (int) as a paramater

}
