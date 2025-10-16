package aggreagtion;

public class Employee {
	private int eId;
	private String eName;
	private String eAddress;
	private double salary;
	private Company company;
	private Department dept;

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String geteAddress() {
		return eAddress;
	}

	public void seteAddress(String eAddress) {
		this.eAddress = eAddress;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", eAddress=" + eAddress + ", salary=" + salary
				+ ", company=" + company + ", dept=" + dept + "]";
	}

}
