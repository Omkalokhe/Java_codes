package controller;

import java.util.Scanner;

import service.ClassService;
import service.ClassServiceImpl;

public class Controller {
	public static void main(String[] args) {
		ClassService classService = new ClassServiceImpl();
		Scanner sc = new Scanner(System.in);
		System.out.println("--------Welcome To Your Coaching Institute--------");
		boolean flag = true;
		while (flag) {
			System.out.println("--------------------------MENU-------------------------");
			System.out.println("1. Add Course");
			System.out.println("2. Diaplay Course Details");
			System.out.println("3. Add Faculty");
			System.out.println("4. Diaplay Faculty Details");
			System.out.println("5. Add Batch");
			System.out.println("6. Diaplay Batch Details");
			System.out.println("7. Add Student");
			System.out.println("8. Diaplay Student Details");
			System.out.println("9. Update Details");
			System.out.println("10. Delete Details");
			System.out.println("11. Exit");
			System.out.println("---------------------------------------------------");
			System.out.println("Enter Your Choice :");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				classService.addCourse();
				break;
			case 2:
				classService.displayCourseDetail();
				break;
			case 3:
				classService.addFaculty();
				break;
			case 4:
				classService.displayFacultyDetail();
				break;
			case 5:
				classService.addBatch();
				break;
			case 6:
				classService.displayBatchDetail();
				break;
			case 7:
				classService.addStudent();
				break;
			case 8:
				classService.displayStudentDetail();
				break;
			case 9:
				classService.updateDetails();
				break;
			case 10:
				classService.deleteDetails();
				break;
			case 11:
				flag = false;
				System.out.println("-----Thanks For Visiting-----");
				break;
			default:
				System.out.println("Invalid choice Please Enter Correct choice...!");
				break;
			}
		}
	}
}
