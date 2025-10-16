package arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeController {
		public static void main(String[] args) {
			Employee emp=new Employee();
			emp.setEid(101);
			emp.seteName("Om");
			emp.setAddress("Pune");
			Employee emp2=new Employee();
			emp2.setEid(102);
			emp2.seteName("Abc");
			emp2.setAddress("Sinnar");
			
			List<Employee> empList=new ArrayList<Employee>();
			empList.add(emp);
			empList.add(emp2);
			Iterator<Employee> itr=empList.iterator();
			
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
		}
}
