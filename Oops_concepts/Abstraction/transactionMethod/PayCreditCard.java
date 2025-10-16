package transactionMethod;

public class PayCreditCard extends Payment{

		@Override
		void makePayment() {
			System.out.println("Payment Is Done By Credit Card");
			
		}
		@Override
		void validatePaymentdetails() {
			System.out.println("Credit Card Detail Validate");
		}
}
