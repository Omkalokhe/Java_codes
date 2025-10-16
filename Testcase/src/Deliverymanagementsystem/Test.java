package Deliverymanagementsystem;

public class Test {
		public static void main(String[] args) {
			Delivery bike=new Bike();
			Delivery car=new Car();
			Delivery drone=new Drone();
			bike.deliver();
			bike.calculateTime();
			car.deliver();
			car.calculateTime();
			drone.deliver();
			drone.calculateTime();
			
		}
}
