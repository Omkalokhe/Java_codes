package Hirechical;

public class ClassC extends ClassA {
	int c=10;
	void getvalueofclassC() {
		System.out.println("In ClassC method");
	}
	public static void main(String[] args) {
		ClassC objC=new ClassC();
		ClassB objB=new ClassB();
		System.out.println(objC.a+" "+" "+objB.b+" "+objC.c);
		objC.getvalueofclassA();
		objC.getvalueofclassC();
		objB.getvalueofclassB();
	}
}
