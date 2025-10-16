package transactionMethod;

public class PayNetBanking extends Payment{

	@Override
	void makePayment() {
		System.out.println("Payment Is Done By Net-Banking");
		
	}
	@Override
	void validatePaymentdetails() {
		System.out.println("Net Banking Detail Validate");
	}
}

