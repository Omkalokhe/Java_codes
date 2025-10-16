package controller;

import java.util.Scanner;

import service.UserService;
import service.UserServiceImpl;

public class UserController {

	public static void main(String[] args) {
//		SessionFactory sf = HibernateConfig.getSessionFactory();
		UserService userService = new UserServiceImpl();
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		while (flag) {
			System.out.println("|----------WELCOME----------|");
			System.out.println("1. Add User");
			System.out.println("2. Display User Details");
			System.out.println("3. Update User");
			System.out.println("4. Delete User");
			System.out.println("5. Display All Uaer Sorted By Salary");
			System.out.println("6. Exit");
			System.out.println("Enter Your Choice : ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				userService.addUser();
				break;
			case 2:
				userService.displayUserDetails();
				break;
			case 3:
				userService.updateUser();
				break;
			case 4:
				userService.delete();
				break;
			case 5:
				userService.sortUser();
				break;
			case 6:
				flag = false;
				System.out.println("-----Thank You For Visiting-----");
				break;
			default:
				System.out.println("Invalid Choice Please Enter valid choice....!!!");
				break;
			}
		}
	}
}
