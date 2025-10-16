package inheratence;

public class ClassC extends ClassA {
	int k=200;
	void m3() {
		System.out.println("ClassC Method");
	}
	
	public static void main(String[] args) {
		ClassC c=new ClassC();
		System.out.println("i="+c.i+" "+"k="+c.k);
		c.m1();
		c.m3();
		ClassB b=new ClassB();
		System.out.println("i="+b.i+" "+"j="+b.j);
		b.m2();
		
	}
}
