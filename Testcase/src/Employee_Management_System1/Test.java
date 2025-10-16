package Employee_Management_System1;

public class Test {
	public static void main(String[] args) {
		System.out.println("***-Employee Details-***");
		Employee empolyee=new Employee("Om",01,1200.1);
		empolyee.showEmployeedetails();
		System.out.println("***-Manager Details-***");
		Manager manager=new Manager("Om",01,1234.1,50);
		manager.showEmployeedetails();
		System.out.println("***-Developer Details-***");
		Developer developer=new Developer("Om",01,1265.1,"Java");
		developer.showEmployeedetails();
		System.out.println("***-Tester Details-***");
		Tester tester=new Tester("Om",01,1235.1,15);
		tester.showEmployeedetails();
	}

}
