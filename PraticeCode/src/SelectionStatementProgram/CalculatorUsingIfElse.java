package SelectionStatementProgram;

import java.util.Scanner;

public class CalculatorUsingIfElse {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Two Number: ");
			int a=sc.nextInt();
			int b=sc.nextInt();
			System.out.println("Press 1 for Addition");
			System.out.println("Press 2 for Substraction");
			System.out.println("Press 3 for Multiplaction");
			System.out.println("Press 4 for Division");
			System.out.println("Press 5 for Moduls");
			System.out.println("Enter Your Choice:");
			int choice=sc.nextInt();
			int result;
			if(choice==1) {
				result=a+b;
				System.out.println("Addition of Two number is: " +result );
			}else if(choice==2) {
				result=a-b;
				System.out.println("Substraction of Two number is: " +result );
			}else if(choice==3) {
				result=a*b;
				System.out.println("Multiplaction of Two number is: " +result );
			}else if(choice==4) {
				result=a/b;
				System.out.println("Division of Two number is: " +result );
			}else if(choice==5) {
				result=a%b;
				System.out.println("Moduls of Two number is: " +result );
			}else {
				System.out.println("Please Enter valid Choice");
			}
			
		}
}
