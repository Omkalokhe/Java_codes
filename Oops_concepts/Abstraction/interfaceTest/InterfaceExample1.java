package interfaceTest;

public class InterfaceExample1 implements Inter {

	@Override
	public void m1() {
		System.out.println("Implementer method M1");

	}

	@Override
	public void m2() {
		System.out.println("Implementer method M1");

	}
	public static void main(String[] args) {
		Inter i=new InterfaceExample1();
		i.m1();
		i.m2();
		System.out.println(Inter.x);
	}

}
