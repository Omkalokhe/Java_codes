package Employee_Management_System1;

public class Manager extends Employee{
	int team_Size;
	Manager(String n,int id,double sal,int ts){
		super(n,id,sal);
		team_Size=ts;
	}
	@Override
	void showEmployeedetails() {
		System.out.println("Employee Name: "+name);
		System.out.println("Employee Id: "+employeeId);
		System.out.println("Employee Salary: "+salary);
		System.out.println("Team Size: "+team_Size);
	}
}
