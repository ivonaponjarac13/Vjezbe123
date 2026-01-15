package observer2;

public class TestObserver2 {

	public static void main(String[] args) {
		CryptoCurrencyPrice cryptoCurrencyPrice = new CryptoCurrencyPrice();
		UpdateSMS updateSMS = new UpdateSMS();
		
		cryptoCurrencyPrice.addObserver(updateSMS);
		
		cryptoCurrencyPrice.setBitcoinPrice(150000);
		cryptoCurrencyPrice.setEtherPrice(70000);

	}

}
