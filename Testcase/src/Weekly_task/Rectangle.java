package Weekly_task;

public class Rectangle {
		double length;
		double breadth;
		
		public Rectangle() {
			
			length=15;
			breadth=20;
		}
		
		void showDimension() {
			System.out.println("Dimension of the Rectangle where Length is "+length+" Breadth is "+breadth);
		}
		public static void main(String[] args) {
			Rectangle obj=new Rectangle();
			obj.showDimension();
		}
}
