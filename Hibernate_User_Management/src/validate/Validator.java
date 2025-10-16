package validate;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Validator {

	public static String validateEmail() {
		Scanner sc = new Scanner(System.in);
		String email = sc.nextLine();
		if (Pattern.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$", email)) {

		} else {
			System.out.println("Invalid Email Address Please Check..!!!");
			validateEmail();
		}
		return email;

	}

	public static String validatePassword() {
		Scanner sc = new Scanner(System.in);
		String pass = sc.nextLine();
		if (Pattern.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!]).{6,}$", pass)) {

		} else {
			System.out.println(
					"Invalid Password Please Check..!!!(It must contain upper case lower case 1 special symbol and digits and greater then 6 char..)");
			validatePassword();
		}
		return pass;

	}
}
