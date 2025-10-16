package aggreagtion;

public class EmployeeDetails {

	public static Employee setDetails() {
			Department dept=new Department();
			dept.setdId(105);
			dept.setdName("IT");
			
			Company c=new Company();
			c.setcId(101);
			c.setcName("MasterCard");
			c.setcAddress("Magarpatta");
			c.setPincode(411044);
			
			Employee emp=new Employee();
			emp.seteId(2130);
			emp.seteName("Om");
			emp.seteAddress("Pune");
			emp.setSalary(150000.0);
			emp.setCompany(c);
			emp.setDept(dept);
			
			return emp;
		}
}
