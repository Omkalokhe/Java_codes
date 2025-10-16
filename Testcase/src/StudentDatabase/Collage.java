package StudentDatabase;

public class Collage {
	
	public Student getStudentData() {
		Student s1=new Student();
		s1.rollNo=01;
		s1.name="Om";
		s1.address="Nigdi";
		return s1;
	}
	
	public Division getallStudent() {
		Division div=new Division();
		div.s1.rollNo=04;
		div.s1.name="Dipa";
		div.s1.address="Pune";
		div.s2.rollNo=05;
		div.s2.name="Shivam";
		div.s2.address="Moshi";
		return div;
	}

}
