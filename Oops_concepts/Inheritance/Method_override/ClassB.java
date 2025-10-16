package Method_override;

public class ClassB extends ClassA{
	
	@Override
	void m1() {
		System.out.println("Override method m1 in classB");
	}
	@Override
	void m3() {
		System.out.println("Override method m3 in classB");
	}
		
	void m4() {
		System.out.println("ClassB m4 Method");
	}
	void m5() {
		System.out.println("ClassB m5 Method");
	}
}
