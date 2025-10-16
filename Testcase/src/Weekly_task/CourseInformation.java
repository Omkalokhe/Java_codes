package Weekly_task;

public class CourseInformation {
		String courseName;
		int duration;
		double fee;
		
		public CourseInformation() {
			// TODO Auto-generated constructor stub
			courseName="Java Full Stack";
			duration=6;
			fee=50000;
		}
		
		void printCourseDetails() {
			System.out.println("Course Name is :"+courseName);
			System.out.println("Course duration is :"+duration+" Month");
			System.out.println("Course fee is :"+fee);
		}
		public static void main(String[] args) {
			CourseInformation obj=new CourseInformation();
			obj.printCourseDetails();
		}
}

