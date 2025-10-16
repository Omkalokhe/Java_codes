package Employee_Management_System1;

public class Employee {
		String name;
		int employeeId;
		double salary;
		
		Employee(String n,int id,double sal){
			name=n;
			employeeId=id;
			salary=sal;
		}
		
		void showEmployeedetails() {
			System.out.println("Employee Name: "+name);
			System.out.println("Employee Id: "+employeeId);
			System.out.println("Employee Salary: "+salary);
		}
}
