package Weekly_task;


public class EmployeeSalary {
		double salary;
		
		public EmployeeSalary() {
			salary=1000000;
			
		}
		void showSalary() {
			System.out.println("Salary of the Employee is "+salary);
		}
		public static void main(String[] args) {
			EmployeeSalary obj=new EmployeeSalary();
			obj.showSalary();
		}
}
