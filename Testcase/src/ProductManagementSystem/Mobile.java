package ProductManagementSystem;

public class Mobile  extends Product{
		@Override
		void displayProduct() {
			System.out.println("Product Name:Iphone Price: $10000");
		}
		
		void productShippingCost() {
			System.out.println("ShippingCost of Product: $10050");
		}
}
