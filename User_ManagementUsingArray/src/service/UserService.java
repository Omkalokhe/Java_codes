package service;

import java.util.Scanner;

import ServiceImpl.UserServiceImpl;
import model.User;
import model.Validators;

public class UserService implements UserServiceImpl {
	Scanner sc = new Scanner(System.in);
	User[] users = new User[5];

	@Override
	public void createUser() {
		System.out.println("|||..Please Enter the no that you need to create User..|||");
		int numberOfAccountCreated = sc.nextInt();
		sc.nextLine();
		if (numberOfAccountCreated < users.length) {
			for (int i = 0; i < numberOfAccountCreated; i++) {
				User user = new User();
				System.out.println("please Enter User ID :");
				user.setUserId(sc.nextInt());

				user.setUserName(Validators.validateName());
				user.setAddress(sc.nextLine());

				user.setEmail(Validators.validateEmail());

				user.setMobileNo(Validators.validateMobileNo());

				user.setPanCardNo(Validators.validatePanCard());

				user.setAadharCardNo(Validators.validateAadhar());
				users[i] = user;
				System.out.println("*****_User Has Been Created Succesfully for index " + i + "_*****\n");
				if (i < numberOfAccountCreated - 1) {
					System.out.println("|||  Now Enter Next User Details  |||\n");
				}
			}

		}

	}

	@Override
	public void displayInfo() {
		boolean flag = true;
		boolean found = false;
		while (flag) {
			System.out.println("Please Enter the User Id you need to Display Details :");
			int checkUserId = sc.nextInt();
			for (User user : users) {
				if (user != null && checkUserId == user.getUserId()  ) {
					System.out.println(
							"---------------------------------------------------------------------------------");
					System.out.printf("| %-10s | %-20s | %-20s | %-20s |\n", "UserID", "Name", "Address", "Email");
					System.out.println(
							"---------------------------------------------------------------------------------");
					System.out.printf("| %-10d | %-20s | %-20s | %-20s |\n", user.getUserId(), user.getUserName(),
							user.getAddress(), user.getEmail());
					System.out.println(
							"---------------------------------------------------------------------------------");

					System.out.println();
					System.out.println("Other Details:");
					System.out.println(
							"---------------------------------------------------------------------------------");
					System.out.println("|     Mobile No    : " + user.getMobileNo() + "     |");
					System.out.println("|     Aadhar No    : " + user.getAadharCardNo() + "     |");
					System.out.println("|     Pan Card No  : " + user.getPanCardNo() + "     |");
					System.out.println();
					found = true;
					break;
				}
				
			}
			if (!found) {
				System.out.println("User Not Found..!!!");
			}
			System.out.println("If You need to Display another User details the press 1 otherwise 0");
			int checkChoice = sc.nextInt();
			if (checkChoice == 0) {
				flag = false;
				System.out.println("Return to Menu\n");
			}
		}

	}

	@Override
	public void updateUserInfo() {
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

	@Override
	public void deleteUser() {
		boolean found=false;
		System.out.println("Please Enter the User Id you need to Display Details :");
		int checkUserId = sc.nextInt();
		for (int i = 0; i < users.length; i++) {
	        if (users[i] != null && users[i].getUserId() == checkUserId) {
	            users[i] = null; 
	            System.out.println("User Deleted Successfully...!!");
	            found = true;
	            break;
	        }
	    }

	    if (!found) {
	        System.out.println("❌ User Not Found..!!!");
	    }

	}

	public void updateName() {
		boolean flag = true;
		while (flag) {
			System.out.println("Enter the UserId You need to Update Details :");
			int checkUserID = sc.nextInt();
			sc.nextLine();
			boolean found = false;

			for (User user : users) {
				if (user != null && user.getUserId() == checkUserID) {
//					System.out.println("Enter the Name that you need to update : ");
					String updatedName = Validators.validateName();

					user.setUserName(updatedName);
					System.out.println("Your Name Updated Successfully to " + updatedName);
					found = true;
					flag = false;
					break;
				}
			}
			if (!found) {
				System.out.println("User Not Found..!!!\\n");
			}
		}
	}

	public void updateAddress() {
		boolean flag = true;
		while (flag) {
			System.out.println("Enter the UserId You need to Update Details :");
			int checkUserID = sc.nextInt();
			sc.nextLine();
			boolean found = false;

			for (User user : users) {
				if (user != null && user.getUserId() == checkUserID) {
//					System.out.println("Enter the Address that you need to update : ");
					String updatedAddress = sc.nextLine();

					user.setAddress(updatedAddress);
					System.out.println("Your Address Updated Successfully to " + updatedAddress);
					found = true;
					flag = false;
					break;
				}
			}
			if (!found) {
				System.out.println("User Not Found..!!!\\n");
			}
		}
	}

	public void updateEmail() {
		boolean flag = true;
		while (flag) {
			System.out.println("Enter the UserId You need to Update Details :");
			int checkUserID = sc.nextInt();
			sc.nextLine();
			boolean found = false;

			for (User user : users) {
				if (user != null && user.getUserId() == checkUserID) {
//					System.out.println("Enter the E-mail that you need to update : ");
					String updatedEmail = Validators.validateEmail();

					user.setEmail(updatedEmail);
					System.out.println("Your E-mail Updated Successfully to " + updatedEmail);
					found = true;
					flag = false;
					break;
				}
			}
			if (!found) {
				System.out.println("User Not Found..!!!\\n");
			}
		}
	}

	public void updateMobileNo() {
		boolean flag = true;
		while (flag) {
			System.out.println("Enter the UserId You need to Update Details :");
			int checkUserID = sc.nextInt();
			boolean found = false;

			for (User user : users) {
				if (user != null && user.getUserId() == checkUserID) {
					long updateMobileNo = Validators.validateMobileNo();
					user.setMobileNo(updateMobileNo);
					System.out.println("Your Mobile Number Updated Successfully to " + updateMobileNo);
					found = true;
					flag = false;
					break;
				}
			}
			if (!found) {
				System.out.println("User Not Found..!!!\n");
			}
		}
	}

}
