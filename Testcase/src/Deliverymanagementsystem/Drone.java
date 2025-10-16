package Deliverymanagementsystem;

public class Drone extends Delivery{
	@Override
	void calculateTime() {
		System.out.println("***Delivery Mode is Drone***");
		System.out.println("Your Delivery Time is 10-15 Min");
	}
}
