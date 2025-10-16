package Deliverymanagementsystem;

public class Bike extends Delivery{
	
	@Override
	void calculateTime() {
		System.out.println("***Delivery Mode is Bike***");
		System.out.println("Your Delivery Time is 1-3 Hours");
	}
}
