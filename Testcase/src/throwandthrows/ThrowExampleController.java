package throwandthrows;

import java.util.Scanner;

public class ThrowExampleController {
	public static void main(String[] args) {
		ExampleOfThrow obj = new ExampleOfThrow();
		while (obj.flag) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your age : ");
			int age = sc.nextInt();

			try {
				obj.userAgeValidation(age);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
