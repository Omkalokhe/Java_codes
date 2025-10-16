package SelectionStatementProgram;

import java.util.Scanner;

// Need to find out the greater number 
public class GreaterNumber {
		Scanner mysc=new Scanner(System.in);
		int a = mysc.nextInt();
		int b = mysc.nextInt();
		
		void checkGreaterNumber() {
			if(a>b) {
				System.out.println("a is greater than b - "+a+" > "+b);
			}else if(a<b) {
				System.out.println("b is greater than a - "+a+" < "+b);
			}else {
				System.out.println("a & b are equal...");
			}
			
		}
		public static void main(String[] args) {
			System.out.println("Enter Two Numbers:");
			GreaterNumber obj=new GreaterNumber();
			obj.checkGreaterNumber();
			
		}
		
}
