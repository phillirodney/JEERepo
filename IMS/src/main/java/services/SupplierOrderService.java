package services;

import java.util.List;

import javax.ejb.Stateless;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

import models.CustomerOrder;
import models.CustomerOrderManager;
import models.StockOrderManager;
import models.StockOrder;


@Stateless
public class SupplierOrderService {

	@Inject
	StockOrderManager stockOrderManager;
	
	public List<StockOrder> returnAll(){
		return stockOrderManager.returnAll();
	}
}
