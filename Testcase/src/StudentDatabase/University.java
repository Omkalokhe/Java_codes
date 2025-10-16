package StudentDatabase;

public class University {
	public static void main(String[] args) {
		Collage c=new Collage();
		Student s=c.getStudentData();
//		System.out.println("First Student Data:"+s.rollNo+" "+s.name+" "+s.address);
		System.out.println(s);
		Division allData=c.getallStudent();
//		System.out.println("Second Student Data:"+allData.s1.rollNo+" "+allData.s1.name+" "+allData.s1.address);
//		System.out.println("Third Student Data:"+allData.s2.rollNo+" "+allData.s2.name+" "+allData.s2.address);
		System.out.println(allData);
	}

}
