package Method_override;

public class Test {
	public static void main(String[] args) {
		ClassA classA=new ClassB();
		System.out.println("---ClassA+B mix object---");
		classA.m1();
		classA.m2();
		classA.m3();
		ClassA classA1=new ClassC();
		System.out.println("---ClassA+C mix object---");
		classA1.m1();
		classA1.m2();
		classA1.m3();
		ClassB classB=new ClassC();
		System.out.println("---ClassB+C mix object---");
		classB.m1();
		classB.m2();
		classB.m3();
		classB.m4();
		classB.m5();
		ClassC classC=new ClassC();
		System.out.println("---ClassC  object---");
		classC.m1();
		classC.m2();
		classC.m3();
		classC.m4();
		classC.m5();
		classC.m6();
		classC.m7();
	}

}
