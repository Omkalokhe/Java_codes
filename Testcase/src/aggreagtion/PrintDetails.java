package aggreagtion;

public class PrintDetails {

	static void printEmployeeDetails() {
		Employee emp = EmployeeDetails.setDetails();
		System.out.println(emp.geteId());
		System.out.println(emp.geteName());
		System.out.println(emp.geteAddress());
		System.out.println(emp.getSalary());
	}

	static void printCompanyDetails() {
		Employee emp = EmployeeDetails.setDetails();
		System.out.println(emp.getCompany().getcId());
		System.out.println(emp.getCompany().getcName());
		System.out.println(emp.getCompany().getcAddress());
		System.out.println(emp.getCompany().getPincode());
	}

	static void printDepartment() {
		Employee emp = EmployeeDetails.setDetails();
		System.out.println(emp.getDept().getdId());
		System.out.println(emp.getDept().getdName());
	}
	
	public static void main(String[] args) {
		System.out.println("-----Employee Details-----");
		printEmployeeDetails();
		System.out.println("-----Company Details-----");
		printCompanyDetails();
		System.out.println("-----Department Details-----");
		printDepartment();
	}

}
