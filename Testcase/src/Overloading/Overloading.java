package Overloading;


public class Overloading {
	void m1() {
		System.out.println("M1 Method with No Parameter");
	}
	void m1(int i) {
		System.out.println("M1 method with Singal Parameter");
	}
	void m1(int i,long j) {
		System.out.println("M1 method with Two Parameter");
	}
	public static void main(String[] args) {
		Overloading obj=new Overloading();
		obj.m1();
		obj.m1(10);
		obj.m1(10, 50l);
			
	}
}
