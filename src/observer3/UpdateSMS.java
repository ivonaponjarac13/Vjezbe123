package observer3;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class UpdateSMS implements PropertyChangeListener {
	
	private double bitcoinPrice;
	private double etherPrice;

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		if(evt.getPropertyName().equals("bitcoin"))
			this.bitcoinPrice = (double)evt.getNewValue();
			else if(evt.getPropertyName().equals("ether"))
				this.etherPrice = (double)evt.getNewValue();
		
		//svaki put kad dodamo novu vrijednost ide novi if. bolje ovo nego observer 1
		
		sendSMS();

	}
	
	public void sendSMS() {
		System.out.println("New price of bitcoin is: " + bitcoinPrice);
		System.out.println("New price of ether is: " + etherPrice);
	}

}
