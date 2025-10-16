package conditionalstatement;

import java.util.Scanner;

public class CalculatorUsingWhile {

	public static void main(String[] args) {
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Number: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int result;
		while (flag) {
			System.out.println("Enter Operation that u need to perfrom(like: +,-,*,/)");
			String operation = sc.next();
			switch (operation) {
			case "+": {
				result = a + b;
				System.out.println(result);
				break;
			}
			case "-": {
				result = a - b;
				System.out.println(result);
				break;
			}
			case "*": {
				result = a * b;
				System.out.println(result);
				break;
			}
			case "/": {
				result = a / b;
				System.out.println(result);
				break;
			}
			case "%": {
				result = a % b;
				System.out.println(result);
				break;
			}
			}
			if (operation.equals("X")) {
				flag = false;
				System.out.println("Program End");
			}

		}
	}

}
