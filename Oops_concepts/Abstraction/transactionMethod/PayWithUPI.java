package transactionMethod;

public class PayWithUPI extends Payment{

	@Override
	void makePayment() {
		System.out.println("Payment Is Done By UPI");
		
	}
	@Override
	void validatePaymentdetails() {
		System.out.println("UPI Detail Validate");
	}
	public static void main(String[] args) {
		Payment upi=new PayWithUPI();
		System.out.println("---------Payment With UPI--------");
		upi.makePayment();
		upi.generateTxnId();
		upi.validatePaymentdetails();
		Payment card=new PayCreditCard();
		System.out.println("---------Payment With Credit Card--------");
		card.makePayment();
		card.generateTxnId();
		card.validatePaymentdetails();
		Payment netBanking=new PayNetBanking();
		System.out.println("---------Payment With Net Banking--------");
		netBanking.makePayment();
		netBanking.generateTxnId();
		netBanking.validatePaymentdetails();
	}
}

