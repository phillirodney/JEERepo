package controllers;

import java.util.List;

import models.*;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;


@Named("stockorder")
@RequestScoped
public class StockOrders {

	@Inject
	
	
	public String getStockOrder(){
		
		
		
		return "report";
		
	}
	
	
}
