package SelectionStatementProgram;
import java.util.Scanner;
public class Greater1From3 {
		Scanner sc=new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		void checkGreaterNumber() {
			if(a>b && a>c) {
				System.out.println("a is greater than b and c");
			}else if(a<b && c<b) {
				System.out.println("b is greater than a and c - "+a+" < "+b);
			}else {
				System.out.println("c is greater than a and b");
			}
}
		public static void main(String[] args) {
			System.out.println("Enter three Number :");
			Greater1From3 obj=new Greater1From3();
			obj.checkGreaterNumber();
		}
}
		
