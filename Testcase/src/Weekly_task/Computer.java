package Weekly_task;

public class Computer {
		String brand;
		int ram;
		String processor;
		
		public Computer() {
			brand="HP";
			ram=8;
			processor="intel i9";
		}
		
		void printSpecs() {
			System.out.println(brand+" "+ram+"GB"+" "+processor);
		}
		public static void main(String[] args) {
			Computer obj=new Computer();
			obj.printSpecs();
		}
}
