package entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "User_Managment")
public class User {
	@Id
	private int uId;

	private String uName;

	private String uAddress;

	private String email;

	private String password;

	private int age;

	private double salary;

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getuId() {
		return uId;
	}

	public void setuId(int uId) {
		this.uId = uId;
	}

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public String getuAddress() {
		return uAddress;
	}

	public void setuAddress(String uAddress) {
		this.uAddress = uAddress;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [uId=" + uId + ", uName=" + uName + ", uAddress=" + uAddress + ", email=" + email + ", password="
				+ password + ", age=" + age + ", salary=" + salary + "]";
	}

}
