package throwandthrows;

public class ExampleOfThrow {
		boolean flag=true;
	void userAgeValidation(int age) {
		System.out.println("Enter Into the userAgeValidation Method");
		if (age >= 18) {
			flag=false;
			System.out.println("Eligible to create bank account");
		} else {
			throw new ArithmeticException("You are not eligible for to create the bank account,"
					+ "Please Visit after the completing age 18...!!!!");
		}
	}

}
