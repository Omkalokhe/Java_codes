package Task_vechical;

public class Car extends Vechicle {
	
		int speed;
	public Car(int vespeed,int carSpeed) {
		super(vespeed);
		this.speed=carSpeed;
		
	}
	
	@Override
	void Display() {
	// TODO Auto-generated method stub
	super.Display();
	System.out.println(this.speed);
	}
	
	public static void main(String[] args) {
		Car car=new Car(100,150);
			car.Display();
		
	}

}
