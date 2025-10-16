package transactionMethod;

 abstract public class Payment {
      String transactionId;
      
      void generateTxnId() {
    	  transactionId="TXN"+System.currentTimeMillis();
    	  System.out.println(transactionId);
      }
      abstract void makePayment();
      abstract void validatePaymentdetails();
}
