package Employee_Management_System1;

public class Developer extends Employee {
	String programmingLanguage;

	Developer(String n, int id, double sal, String pl) {
		super(n, id, sal);
		programmingLanguage = pl;
	}

	@Override
	void showEmployeedetails() {
		System.out.println("Employee Name: " + name);
		System.out.println("Employee Id: " + employeeId);
		System.out.println("Employee Salary: " + salary);
		System.out.println("Programming Language Used: " + programmingLanguage);

	}
}
