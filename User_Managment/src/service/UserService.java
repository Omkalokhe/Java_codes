package service;

import java.util.Scanner;

import model.User;
import serviceImpl.UserServiceImpl;

public class UserService implements UserServiceImpl {

	Scanner sc = new Scanner(System.in);
	User user = new User();

	@Override
	public void createUser() {
		System.out.println("Please Enter the User ID :");
		user.setUserId(sc.nextInt());
		sc.nextLine();
		System.out.println("Please Enter the User Name :");
		user.setUserName(sc.nextLine());
		System.out.println("Please Enter the Address :");
		user.setAddress(sc.nextLine());
		System.out.println("Please Enter Email :");
		user.setEmail(sc.nextLine());
		System.out.println("Please Enter Mobile Number :");
		user.setMobileNo(sc.nextLong());
		System.out.println("Please Enter Aadhar No :");
		user.setAadharCardNo(sc.next());
		System.out.println("Please Enter Pan Card No :");
		user.setPanCardNo(sc.next());

	}

	@Override
	public void displayInfo() {
		System.out.println("Please Enter the User Id you need to Display Details :");
		int checkUserId = sc.nextInt();
		if (checkUserId == user.getUserId() && user!=null) {
			System.out.println("---------------------------------------------------------------------------------");
			System.out.printf("| %-10s | %-20s | %-20s | %-20s |\n", "UserID", "Name", "Address", "Email");
			System.out.println("---------------------------------------------------------------------------------");
			System.out.printf("| %-10d | %-20s | %-20s | %-20s |\n", user.getUserId(), user.getUserName(),
					user.getAddress(), user.getEmail());
			System.out.println("---------------------------------------------------------------------------------");

			System.out.println();
			System.out.println("Other Details:");
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println("|     Mobile No    : " + user.getMobileNo() + "     |");
			System.out.println("|     Aadhar No    : " + user.getAadharCardNo() + "     |");
			System.out.println("|     Pan Card No  : " + user.getPanCardNo() + "     |");
			System.out.println();
		} else {
			System.out.println("User Not Found...!!!!");
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
		System.out.println("Please Enter the User Id you need to Display Details :");
		int checkUserId = sc.nextInt();
		if (checkUserId == user.getUserId()&& user!=null) {
			user=null;
			System.out.println("User Deleted Successfully...!!");
		}
		else {
			System.out.println("User Not Found..!!!");
		}
		

	}
	public void updateName() {
		System.out.println("Enter Name Which You need to Update : ");
		sc.nextLine();
		String name = sc.nextLine();
		user.setUserName(name);
		System.out.println("Name Updated Successfully to " + name);
	}

	public void updateAddress() {
		System.out.println("Enter Address Which You need to Update : ");
		sc.nextLine();
		String address = sc.nextLine();
		user.setAddress(address);
		System.out.println("Address Updated Successfully to " + address);
	}

	public void updateEmail() {
		System.out.println("Enter Email Which You need to Update : ");
		sc.nextLine();
		String email = sc.nextLine();
		user.setEmail(email);
		System.out.println("Email Updated Successfully to " + email);
	}

	public void updateMobileNo() {
		System.out.println("Please Enter The Number you went to Update ");
		long mobileNo=sc.nextLong();
		user.setMobileNo(mobileNo);
		System.out.println("Mobile Number Updated Successfully to "+mobileNo);
	}

}
