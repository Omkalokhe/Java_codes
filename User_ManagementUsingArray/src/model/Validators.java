package model;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Validators {
	static Scanner sc = new Scanner(System.in);

	public static long validateMobileNo() {
		boolean flag = true;
		long mobileNo = 0;
		while (flag) {
			System.out.println("Enter Mobile Number : ");
			mobileNo = sc.nextLong();
			sc.nextLine();
			if (mobileNo >= 6000000000L && mobileNo <= 9999999999L) {

				flag = false;
			} else {
				System.out.println("Invalid Mobile Number Please Check..!!!");
			}
		}
		return mobileNo;
	}

	public static String validateName() {
		System.out.println("Enter User Full Name : ");
		String name = sc.nextLine();
		if (Pattern.matches("[A-Za-z ]+", name)) {

		} else {
			System.out.println("Invalid Entry Please Check..!!!");
			validateName();
		}
		return name;
	}

	public static String validatePanCard() {
		System.out.println("Enter Pan Card No : ");
		String panNo = sc.nextLine();
		if (Pattern.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}", panNo)) {

		} else {
			System.out.println("Invalid Entry Please Check..!!!");
			validatePanCard();
		}
		return panNo;
	}

	public static String validateAadhar() {
		System.out.println("Enter Aadhar Card No : ");
		String aadharNo = sc.nextLine();
		if (Pattern.matches("[2-9]{1}[0-9]{3}[ ]{1}[0-9]{4}[ ]{1}[0-9]{4}", aadharNo)) {

		} else {
			System.out.println("Invalid Entry Please Check..!!!");
			validateAadhar();
		}
		return aadharNo;
	}

	public static String validateEmail() {
		System.out.println("Enter Email : ");
		String email = sc.nextLine();
		if (Pattern.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$", email)) {

		} else {
			System.out.println("Invalid Entry Please Check..!!!");
			validateEmail();
		}
		return email;

	}

}
