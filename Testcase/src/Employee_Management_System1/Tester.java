package Employee_Management_System1;

public class Tester extends Employee{
		int noOfBugs;
		Tester(String n, int id, double sal, int nbug) {
			super(n, id, sal);
			noOfBugs = nbug;
		}
		void showEmployeedetails() {
			System.out.println("Employee Name: " + name);
			System.out.println("Employee Id: " + employeeId);
			System.out.println("Employee Salary: " + salary);
			System.out.println("Number Of Bugs Solved: " +noOfBugs);

		}
}
