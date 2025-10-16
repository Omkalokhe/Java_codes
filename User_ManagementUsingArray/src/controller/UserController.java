package controller;

import java.util.Scanner;

import service.UserService;
import ServiceImpl.UserServiceImpl;

public class UserController {
	public static void main(String[] args) {
		System.out.println("_-_-_-_Welcome To User Management Portal_-_-_-_\n");

		Scanner sc = new Scanner(System.in);
		UserServiceImpl user = new UserService();

		boolean flag = true;
		while (flag) {
			System.out.println("1: Create a New User.");
			System.out.println("2: Show User Details.");
			System.out.println("3: Update Details of User.");
			System.out.println("4: Delete the Details of User.");
			System.out.println("5: Exit.\n");
			System.out.println("Enter Your Choice From above Option: ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				user.createUser();
				break;
			case 2:
				user.displayInfo();
				break;
			case 3:
				user.updateUserInfo();
				break;
			case 4:
				user.deleteUser();
				break;
			case 5:
				flag = false;
				System.out.println("_-_-_-_THANK YOU FOR VISITING_-_-_-_");
				break;

			default:
				System.out.println("Please Enter Valid Choice....\n");
				break;
			}

		}

	}


}
