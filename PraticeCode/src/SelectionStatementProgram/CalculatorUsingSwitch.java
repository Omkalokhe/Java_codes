package SelectionStatementProgram;

import java.util.Scanner;

public class CalculatorUsingSwitch {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two Number: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int result;
		System.out.println("Enter Operation that u need to perfrom(like: +,-,*,/)");
		String operation=sc.next();
		switch (operation) {
		case "+": {
			result=a+b;
			System.out.println(result);
			break;
		}
		case "-":{
			result=a-b;
			System.out.println(result);
			break;
		}
		case "*":{
			result=a*b;
			System.out.println(result);
			break;
		}
		case "/":{
			result=a/b;
			System.out.println(result);
			break;
		}
		case "%":{
			result=a%b;
			System.out.println(result);
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + operation);
		}
		
	}
}
