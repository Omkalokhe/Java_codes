package SwapVariable;


// Swap Using the 3 variable
public class SwapVariable {
		int a=10;
		int b=20;
		int c;
		void swap() {
			c=a;
			a=b;
			b=c;
			System.out.println("a= "+a+" b= "+b);
		}
		public static void main(String[] args) {
			SwapVariable obj =new SwapVariable();
			obj.swap();
		}
}
