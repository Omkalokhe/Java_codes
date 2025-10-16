package model;

import java.util.Scanner;

public class Validators {
	Scanner sc=new Scanner(System.in);
	long validateMobileNo() {
		boolean flag = true;
		long mobileNo = 0;
		while (flag) {
			System.out.println("Enter Mobile Number : ");
			mobileNo = sc.nextLong();
			if (mobileNo >= 6000000000L && mobileNo <= 9999999999L) {

				flag = false;
			} else {
				System.out.println("Invalid Mobile Number Please Check..!!!");
			}
		}
		return mobileNo;
	}


}
