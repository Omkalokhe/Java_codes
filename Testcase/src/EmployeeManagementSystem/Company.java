package EmployeeManagementSystem;

public class Company {
	
	public static void main(String[] args) {
		Depertment dept=new Depertment();
		Employee emp=dept.getEmployeeData();
		System.out.println("Single Emp Data:"+emp.empId+" "+emp.empName+" "+emp.salary);
		
		AllEmployee allemp=dept.getAllEmployeeData();
		System.out.println("All Student Data:");
		System.out.println(allemp.emp1.empId+" "+allemp.emp1.empName+" "+allemp.emp1.salary);
		System.out.println(allemp.emp2.empId+" "+allemp.emp2.empName+" "+allemp.emp2.salary);
		System.out.println(allemp.emp3.empId+" "+allemp.emp3.empName+" "+allemp.emp3.salary);
	}
}
