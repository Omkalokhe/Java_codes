package arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class EmployeeController2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Employee> list = new ArrayList<Employee>();
		boolean flag = true;
		while (flag) {
			Employee emp = new Employee();
			System.out.println("-------Enter Employee Details------");
			System.out.println("Enter Employee Id :");
			emp.setEid(sc.nextInt());
			sc.nextLine();
			System.out.println("Enter Employee Name :");
			emp.seteName(sc.nextLine());
			System.out.println("Enter Employee Address :");
			emp.setAddress(sc.nextLine());
			list.add(emp);
			System.out.println("Employee Created Successfully");
			System.out.println("If you need to add more Employee press any Number otherwise 0");
			int n = sc.nextInt();
			if (n == 0) {
				flag = false;
			}
		}
		
		System.out.println("Here is Details of Employee");
		Iterator<Employee> itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
