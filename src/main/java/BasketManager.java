import java.util.*;

public interface BasketManager{


	 Basket findById(int id);

	 List<Basket> findBasketsByCustomerId(int id);

	 Basket createBasket(Basket basket);

	 void updateBasket(Basket basket);

	 void deleteBasket(Basket basket);

	//Possibly create a delete which takes the ID (int) as a paramater

}
