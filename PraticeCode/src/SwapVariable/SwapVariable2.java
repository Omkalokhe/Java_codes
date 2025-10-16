package SwapVariable;

public class SwapVariable2 {
	int a=10;
	int b=20;
	
	// Swap Using the Or Operate
	void swap() {
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("a= "+a+" b= "+b);
	}
	
	// Swap using Add Sub
	void swap2() {
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a= "+a+" b= "+b);
	}
	
	public static void main(String[] args) {
		SwapVariable2 obj =new SwapVariable2();
//		obj.swap();
		obj.swap2();
	}
}
