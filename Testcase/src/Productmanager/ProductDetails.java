package Productmanager;

public class ProductDetails {
	
	byte byteTypedata() {
		return 5;
	}
	
	short shortTypedata() {
		return 5;
	}

	Product addProduct() {
		Product p = new Product();
		p.pId = 1;
		p.name = "iphone";
		p.count = 5;
		return p;
	}

	Order addOrder() {
		Order o = new Order();
		o.name = "iphone";
		o.orderDate = "15/01/20";
		o.address = "Nigdi bus Stand pune";
		return o;
	}

	Customer addCustomer() {
		Customer c = new Customer();
		c.cId = 120;
		c.emailId = "omkalokhe105@gmail.com";
		c.name = "Om_Kalokhe";
		c.mobileNo = 8329732311l;
		return c;
	}

	public static void main(String[] args) {
		ProductDetails pd = new ProductDetails();
		Product p = pd.addProduct();
		System.out.println("--------Product Details------");
		System.out.println(p.pId + " " + p.name + " " + p.count);

		Order o = pd.addOrder();
		System.out.println("--------Order Details---------");
		System.out.println(o.name + " " + o.address + " " + o.orderDate);

		Customer c = pd.addCustomer();
		System.out.println("------Customer Details---------");
		System.out.println(c.cId + " " + c.name + " " + c.emailId + " " + c.mobileNo);
		
		byte b=pd.byteTypedata();
		System.out.println(b);
	}
}
