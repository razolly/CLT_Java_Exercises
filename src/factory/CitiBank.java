package factory;

public class CitiBank implements Bank {

	@Override
	public void offerCreditCard() {
		System.out.println("Citi Bank ==> Credit Card");
	}

}
