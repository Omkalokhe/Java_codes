package ProductManagementSystem;

public class Test {
	
	public static void main(String[] args) {
		Product m=new Mobile();
		System.out.println("++++++Product+Mobile Mix Object++++++");
		m.displayProduct();
		m.productShippingCost();
		Product c=new Clothing();
		System.out.println("+++++++Product+Clothing Mix Object++++++");
		c.displayProduct();
		c.productShippingCost();
		Product g=new Groceries();
		System.out.println("+++++Product+Groceries Mix Object+++++");
		g.displayProduct();
		g.productShippingCost();
	}
}
