package controllers;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.ConversationScoped;
import javax.inject.Inject;
import javax.inject.Named;

import models.CustomerOrder;
import models.StockOrder;
import services.CustomerOrderService;
import services.SupplierOrderService;


@ConversationScoped
@Named(value = "supplierorder")
public class SupplierOrderController implements Serializable {
	
	private static final long serialVersionUID = 77878740772887L;

	@Inject
	private SupplierOrderService supplierOrderService;
	
	public List<StockOrder> getOrders(){
		return supplierOrderService.returnAll();
	}
	
	
}
