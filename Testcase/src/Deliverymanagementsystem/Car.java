package Deliverymanagementsystem;

public class Car extends Delivery{
	
	@Override
	void calculateTime() {
		System.out.println("***Delivery Mode is Car***");
		System.out.println("Your Delivery Time is 0.5-1 Hours");
	}
}
