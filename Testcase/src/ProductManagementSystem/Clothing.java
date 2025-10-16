package ProductManagementSystem;

public class Clothing extends Product{
	@Override
	void displayProduct() {
		System.out.println("Product Name:T-Shirt Price: $100");
	}
	
	void productShippingCost() {
		System.out.println("ShippingCost of Product: $150");
	}

}
