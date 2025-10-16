package Paratermize_method;

public class Collage {
		
		public void getStudentData(Student st) {
			System.out.println(st.rollNo+" "+st.name+" "+st.percentage);
		}
		public static void main(String[] args) {
			Collage cg=new Collage();
			Student s=new Student();
			s.rollNo=01;
			s.name="Om";
			s.percentage=91;
			Student s1=new Student();
			s1.rollNo=2;
			s1.name="Partik";
			s1.percentage=92;
			cg.getStudentData(s);
			cg.getStudentData(s1);
		}
		
}
