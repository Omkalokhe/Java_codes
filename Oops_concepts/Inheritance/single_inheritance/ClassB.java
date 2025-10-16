package single_inheritance;

public class ClassB extends ClassA{
		int b=10;
		void getvalueofclassB() {
			System.out.println("In ClassB method");
		}
		public static void main(String[] args) {
			ClassB obj=new ClassB();
			System.out.println(obj.a+" "+obj.b);
			obj.getvalueofclassA();
			obj.getvalueofclassB();
			
			
		}
}
