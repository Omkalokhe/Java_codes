package services;

import java.util.Scanner;
import model.Account;
import model.Constant;
import model.Validators;

public class SBI implements RBI {

	Scanner sc = new Scanner(System.in);
	Account[] accounts = new Account[Constant.max_Size];

	@Override
	public void createAccount() {
		System.out.println("|||..Please Enter the no that you need to create Account..|||");
		int numberOfAccountCreated = sc.nextInt();
		sc.nextLine();
		if (numberOfAccountCreated < Constant.max_Size) {
			for (int i = 0; i < numberOfAccountCreated; i++) {
				Account account = new Account();
				long accountNumberGenerater = (long) (Math.random() * Math.pow(10, 12));
				account.setAccountNo(accountNumberGenerater);
				System.out.println("Account Number is " + accountNumberGenerater);

				account.setAccountHolderName(Validators.validateName());
				System.out.println("Enter Address :");
				account.setAddress(sc.nextLine());

				account.setEmail(Validators.validateEmail());

				account.setMobileNo(Validators.validateMobileNo());

				account.setPanCardNo(Validators.validatePanCard());

				account.setAddharCardNo(Validators.validateAadhar());
				accounts[i] = account;
				System.out.println("*****Account Has Been Created Succesfully for index " + i + " *****\n");
				if (i < numberOfAccountCreated - 1) {
					System.out.println("|||  Now Enter Next Account Details  |||\n");
				}
			}

		}
	}

	@Override
	public void showAccountDetails() {
		for (Account account : accounts) {
			if (account != null) {
				System.out.println(account);
			}
		}

	}

	@Override
	public void showAccountBalance() {

		boolean flag = true;
		while (flag) {
			System.out.println("Please Your Account Number :");
			long checkAccountNumber = sc.nextLong();
			boolean found = false;
			for (Account account : accounts) {

				if (account != null && account.getAccountNo() == checkAccountNumber) {
					System.out.println("Account Balance " + account.getBalance() + "RS Only\n");
					found = true;
					break;
				}
			}
			if (!found) {
				System.out.println("Invalid Account Number\n");
			}
			System.out.println("||| If you need to check another Account Balance then Press 1 otherwise 0 |||");
			int choice = sc.nextInt();
			if (choice == 0) {
				flag = false;
			}

		}
	}

	@Override
	public void withdrawAmount() {
		boolean flag = true;
		while (flag) {
			System.out.println("Please Your Account Number :");
			long checkAccountNumber = sc.nextLong();
			boolean found = false;
			for (Account account : accounts) {

				if (account != null && account.getAccountNo() == checkAccountNumber) {
					System.out.println("Enter the Withdraw Amount : ");
					double withdrawAmount = sc.nextDouble();
					double accountBalance = account.getBalance();
					if (withdrawAmount > accountBalance) {
						System.out.println("Insufficent Account Balance");
					} else {
						double updatedBalance = accountBalance - withdrawAmount;
						account.setBalance(updatedBalance);
						System.out.println("Withdraw Succesfully Procced");
						System.out.println("Your Remaining Balance is " + updatedBalance + "Rs Only\n");
					}
					found = true;
					break;
				}
			}
			if (!found) {
				System.out.println("Invalid Account Number\n");
			}
			System.out.println("||| If you need to Withdraw from another Account then Press 1 otherwise 0 |||");
			int choice = sc.nextInt();
			if (choice == 0) {
				flag = false;
			}

		}

	}

	@Override
	public void depositAmount() {
		boolean flag = true;
		while (flag) {
			System.out.println("Please Your Account Number :");
			long checkAccountNumber = sc.nextLong();
			boolean found = false;

			for (Account account : accounts) {
				double accountBalance = account.getBalance();
				if (account != null && account.getAccountNo() == checkAccountNumber) {
					System.out.println("Enter the Deposit Amount : ");
					double depositAmount = sc.nextDouble();
					accountBalance += depositAmount;
					account.setBalance(accountBalance);
					System.out.println("Your Amount Deposit Successfully");
					System.out.println("Your Total Balance is " + accountBalance + "Rs Only\n");
					found = true;
					break;
				}
			}
			if (!found) {
				System.out.println("Invalid Account Number\n");
			}
			System.out.println("||| If you need to Deposit amount in another Account then Press 1 otherwise 0 |||");
			int choice = sc.nextInt();
			if (choice == 0) {
				flag = false;
			}

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
		boolean flag = true;
		while (flag) {
			System.out.println("Enter the Account Number You need to Update Details :");
			long checkAccountNumber = sc.nextLong();
			sc.nextLine();
			boolean found = false;

			for (Account account : accounts) {
				if (account != null && account.getAccountNo() == checkAccountNumber) {
					System.out.println("Enter the Name that you need to update : ");
					String updatedName = sc.nextLine();

					account.setAccountHolderName(updatedName);
					System.out.println("Your Name Updated Successfully to " + updatedName);
					found = true;
					flag = false;
					break;
				}
			}
			if (!found) {
				System.out.println("Invalid Account Number\n");
			}
		}
	}

	public void updateAddress() {
		boolean flag = true;
		while (flag) {
			System.out.println("Enter the Account Number You need to Update Details :");
			long checkAccountNumber = sc.nextLong();
			sc.nextLine();
			boolean found = false;

			for (Account account : accounts) {
				if (account != null && account.getAccountNo() == checkAccountNumber) {
					System.out.println("Enter the Address that you need to update : ");
					String updatedAddress = sc.nextLine();

					account.setAddress(updatedAddress);
					System.out.println("Your Address Updated Successfully to " + updatedAddress);
					found = true;
					flag = false;
					break;
				}
			}
			if (!found) {
				System.out.println("Invalid Account Number\n");
			}
		}
	}

	public void updateEmail() {
		boolean flag = true;
		while (flag) {
			System.out.println("Enter the Account Number You need to Update Details :");
			long checkAccountNumber = sc.nextLong();
			sc.nextLine();
			boolean found = false;

			for (Account account : accounts) {
				if (account != null && account.getAccountNo() == checkAccountNumber) {
					System.out.println("Enter the E-mail that you need to update : ");
					String updatedEmail = sc.nextLine();

					account.setEmail(updatedEmail);
					System.out.println("Your E-mail Updated Successfully to " + updatedEmail);
					found = true;
					flag = false;
					break;
				}
			}
			if (!found) {
				System.out.println("Invalid Account Number\n");
			}
		}
	}

	public void updateMobileNo() {
		boolean flag = true;
		while (flag) {
			System.out.println("Enter the Account Number You need to Update Details :");
			long checkAccountNumber = sc.nextLong();
			boolean found = false;

			for (Account account : accounts) {
				if (account != null && account.getAccountNo() == checkAccountNumber) {
					long updateMobileNo = Validators.validateMobileNo();
					account.setMobileNo(updateMobileNo);
					System.out.println("Your Mobile Number Updated Successfully to " + updateMobileNo);
					found = true;
					flag = false;
					break;
				}
			}
			if (!found) {
				System.out.println("Invalid Account Number\n");
			}
		}
	}

}
