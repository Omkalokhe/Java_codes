package service;

import java.util.Scanner;


import model.Account;

public class SBI implements RBI {

	Scanner sc = new Scanner(System.in);
	Account account = new Account();

	@Override
	public void createAccount() {
		long accountNumberGenerater = (long) (Math.random() * Math.pow(10, 12));
		account.setAccountNo(accountNumberGenerater);
		System.out.println("Account Number is " + accountNumberGenerater);
//		sc.nextLine();

		System.out.println("Enter Account Holder Full Name : ");
		account.setAccountHolderName(sc.nextLine());

		System.out.println("Enter Address : ");
		account.setAddress(sc.nextLine());

		System.out.println("Enter Email-ID : ");
		account.setEmail(sc.nextLine());

		validateMobileNo();
		sc.nextLine();

		System.out.println("Enter PAN Card Number : ");
		account.setPanCardNo(sc.nextLine());

		System.out.println("Enter Aadhar Card Number : ");
		account.setAddharCardNo(sc.nextLine());

		System.out.println("*****Account Has Been Created Succesfully*****\n");

	}

	@Override
	public void showAccountDetails() {
		System.out.println("Please Your Account Number :");
		long checkAccountNumber = sc.nextLong();
		long accountNo = account.getAccountNo();
		if (checkAccountNumber == accountNo) {
			System.out.println(account);
		} else {
			System.out.println("Invalid Account Number");
		}
	}

	@Override
	public void showAccountBalance() {
		System.out.println("Please Your Account Number :");
		long checkAccountNumber = sc.nextLong();
		long accountNo = account.getAccountNo();
		if (checkAccountNumber == accountNo) {
			System.out.println("Account Balance " + account.getBalance() + "RS Only\n");
		} else {
			System.out.println("Invalid Account Number");
		}

	}

	@Override
	public void withdrawAmount() {
		System.out.println("Please Your Account Number :");
		long checkAccountNumber = sc.nextLong();
		long accountNo = account.getAccountNo();
		if (checkAccountNumber == accountNo) {
			System.out.println("Enter the Withdraw Amount : ");
			double withdrawAmount = sc.nextDouble();
			double accountBalance = account.getBalance();
			if (withdrawAmount > accountBalance) {
				System.out.println("Insufficent Account Balance");
			} else {
				double updatedBalance = accountBalance - withdrawAmount;
				account.setBalance(updatedBalance);
				System.out.println("Withdraw Succesfully Procced");
				System.out.println("Your Remaining Balance is " + updatedBalance + "Rs Only");
			}
		} else {
			System.out.println("Invalid Account Number");
		}

	}

	@Override
	public void depositAmount() {
		System.out.println("Please Your Account Number :");
		long checkAccountNumber = sc.nextLong();
		long accountNo = account.getAccountNo();
		double accountBalance = account.getBalance();
		if (checkAccountNumber == accountNo) {
			System.out.println("Enter the Deposit Amount : ");
			double depositAmount = sc.nextDouble();
			accountBalance += depositAmount;
			System.out.println("Your Amount Deposit Successfully");
			System.out.println("Your Total Balance is " + accountBalance + "Rs Only");
		} else {
			System.out.println("Invalid Account Number");
		}

	}

	@Override
	public void updateDetails() {
		boolean flag = true;
		while (flag) {
			System.out.println("_-_-_-_Update Menu_-_-_-_\n");
			System.out.println("1: Update Name.");
			System.out.println("2: Update Address.");
			System.out.println("3: Update Email.");
			System.out.println("4: Update Mobile Number.");
			System.out.println("5: Exit.");
			System.out.println("Enter Your Choice From above Option: ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				updateName();
				break;
			case 2:
				updateAddress();
				break;
			case 3:
				updateEmail();
				break;
			case 4:
				updateMobileNo();
				break;
			case 5:
				flag = false;
				System.out.println("Return to Menu");
				break;
			default:
				System.out.println("Please Enter Valid Choice....\n");
				break;
			}
		}

	}

	public void updateName() {
		System.out.println("Enter Name Which You need to Update : ");
		sc.nextLine();
		String name = sc.nextLine();
		account.setAccountHolderName(name);
		System.out.println("Name Updated Successfully to " + name);
	}

	public void updateAddress() {
		System.out.println("Enter Address Which You need to Update : ");
		sc.nextLine();
		String address = sc.nextLine();
		account.setAccountHolderName(address);
		System.out.println("Address Updated Successfully to " + address);
	}

	public void updateEmail() {
		System.out.println("Enter Email Which You need to Update : ");
		sc.nextLine();
		String email = sc.nextLine();
		account.setAccountHolderName(email);
		System.out.println("Email Updated Successfully to " + email);
	}

	public void updateMobileNo() {
		validateMobileNo();
		long mobileNo=account.getMobileNo();
		System.out.println("Mobile Number Updated Successfully to "+mobileNo);
	}

	void validateMobileNo() {
		boolean flag = true;
		while (flag) {
			System.out.println("Enter Mobile Number : ");
			long mobileNo = sc.nextLong();
			if (mobileNo >= 6000000000L && mobileNo <= 9999999999L) {
				account.setMobileNo(mobileNo);
				flag = false;
			} else {
				System.out.println("Invalid Mobile Number Please Check..!!!");
			}
		}
	}

}
