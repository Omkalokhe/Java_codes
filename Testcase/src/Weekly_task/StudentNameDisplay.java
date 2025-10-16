package Weekly_task;

public class StudentNameDisplay {
		String studentName;
		
		public StudentNameDisplay() {
			// TODO Auto-generated constructor stub
			studentName="Om";
		}
		
		public void diaplayStudent() {
			System.out.println("Student Name is "+studentName);
		}
		public static void main(String[] args) {
			StudentNameDisplay obj=new StudentNameDisplay();
			obj.diaplayStudent();
		}
}
