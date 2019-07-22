package factory;

public class JPMorganBank implements Bank {

	@Override
	public void offerCreditCard() {
		System.out.println("JP Morgan ==> Credit Card");
	}

}
