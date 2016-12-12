package controllers;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import models.*;

@SessionScoped
@Named("sorder")
public class SelectedSupplyOrder implements Serializable{
	
	private static final long serialVersionUID = -1656556l;
	
	private StockOrder supplyOrder;
	
	public StockOrder getSupplyOrder() {
		return this.supplyOrder;
	}
	
	public String selectSupplyOrder(StockOrder supplyOrder) {
		this.supplyOrder = supplyOrder;
		return "Imstuff";
	}
	
	public  List<StockOrder> getStockOrders(){
		if(supplyOrder == null){return null;}
		return supplyOrder.getSupplyOrderLines();
	}
	
	public Supplier getSupplier() {
		
		if(supplyOrder == null){return null;}
		return supplyOrder.getSupplier();
		
	}
	
	
	

}
