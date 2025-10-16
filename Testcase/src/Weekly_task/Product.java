package Weekly_task;

public class Product {
	 String productName;
	 int price;
	 void showProductDetails() {
		 System.out.println("Product Details are as follows: Name:"+productName+" price:"+price);
	 }
	 public static void main(String[] args) {
		Product obj=new Product();
		obj.showProductDetails();
	}
}
