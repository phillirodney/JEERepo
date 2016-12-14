package controllers;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
 
import org.primefaces.event.SlideEndEvent;
 
@ManagedBean
public class SliderView {
    
	public class SliderBean {
		private int number;
		public int getNumber() {
			 	 return number;
		}
		public void setNumber(int number) {
			 	 this.number = number;
		}
		}
}