package controller;

import java.util.Scanner;

import service.RBI;
import service.SBI;

public class AccountController {
	
	public static void main(String[] args) {
		System.out.println("_-_-_-_Welcome To SBI_-_-_-_\n");
		
		Scanner sc=new Scanner(System.in);
		RBI sbi=new SBI();
		
		boolean flag=true;
		while (flag) {
			System.out.println("1: Create a New Account.");
			System.out.println("2: Show Account Details.");
			System.out.println("3: Show Account Balance.");
			System.out.println("4: Withdraw Amount from Account.");
			System.out.println("5: Deposite Amount in Account.");
			System.out.println("6: Update Details of Account.");
			System.out.println("7: Exit.\n");
			System.out.println("Enter Your Choice From above Option: ");
			int choice=sc.nextInt();
			switch (choice) {
			case 1:
				sbi.createAccount();
				break;
			case 2:
				sbi.showAccountDetails();
				break;
			case 3:
				sbi.showAccountBalance();
				break;
			case 4:
				sbi.withdrawAmount();
				break;
			case 5:
				sbi.depositAmount();
				break;
			case 6:
				sbi.updateDetails();
				break;
			case 7:
				flag=false;
				System.out.println("_-_-_-_THANK YOU FOR VISITING_-_-_-_");
				break;

			default:
				System.out.println("Please Enter Valid Choice....\n");
				break;
			}
			
		}
		
	}

}
