package Paratermize_method;

public class Detail {
	
	public void carmethod(Car c) {
		System.out.println(c.name+" "+c.carNo+" "+c.modelNo);
	}
	public static void main(String[] args) {
		Car c=new Car();
		Detail d=new Detail();
		c.name="thar";
		c.carNo=1010;
		c.modelNo=121;
		d.carmethod(c);
	}
	

}
