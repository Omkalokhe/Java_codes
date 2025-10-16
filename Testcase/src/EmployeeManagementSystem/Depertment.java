package EmployeeManagementSystem;


public class Depertment {
	
	Employee getEmployeeData() {
		Employee emp=new Employee();
		emp.empId=101;
		emp.empName="Om";
		emp.salary=1.57;
		return emp;
	}
	
	AllEmployee getAllEmployeeData() {
		AllEmployee allemp= new AllEmployee();
		allemp.emp1.empId=102;
		allemp.emp1.empName="Shivam";
		allemp.emp1.salary=3.12;
		allemp.emp2.empId=103;
		allemp.emp2.empName="Vaibhav";
		allemp.emp2.salary=7.12;
		allemp.emp3.empId=104;
		allemp.emp3.empName="Kalpesh";
		allemp.emp3.salary=8.12;
		return allemp;
		
	}
}
