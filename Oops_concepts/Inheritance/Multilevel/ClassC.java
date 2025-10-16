package Multilevel;

public class ClassC extends ClassB{
	int c=30;
	public void getvalueofclassC() {
		System.out.println("In ClassC method");
	}
	public static void main(String[] args) {
		ClassC obj=new ClassC();
		System.out.println(obj.a+" "+obj.b+" "+obj.c);
		obj.getvalueofclassA();
		obj.getvalueofclassB();
		obj.getvalueofclassC();
		
	}
}
