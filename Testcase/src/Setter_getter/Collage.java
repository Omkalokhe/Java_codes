package Setter_getter;

import java.util.Scanner;

public class Collage {
	
	public void displayStudentdata(Student s) {
		System.out.println("Student Details: RollNo: "+s.getRollNo()+" Name: "+s.getName()+" Address"+s.getAddress()+" Percentage: "+s.getPercentage());
	}
		
	public static void main(String[] args) {
		Student st=new Student();
		st.setRollNo(01);
		st.setName("Om");
		st.setAddress("Pune-Nigdi");
		st.setPercentage(86);
		Collage c=new Collage();
		
		Scanner s=new Scanner(System.in);
		
		c.displayStudentdata(st);
		
	}
}
