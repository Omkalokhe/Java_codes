package Static_Keyword;

public class Student {
	int rollNo = 01;
	String name = "Om";
	static String collageName = "SITS";

	void displayData() {

		System.out.println("Instance Method" + rollNo + name + collageName);
	}

	static void displayData1() {
		Student s = new Student();
		System.out.println("Static Method" + s.rollNo + s.name + collageName);
	}
	
	static class Division{  //Nested Class 
		
		void displayData2() {
			Student s = new Student();
			System.out.println("Instance Method" + s.rollNo + s.name + collageName);
		}
	}
	

	public static void main(String[] args) {
//		

		Student s = new Student();
		System.out.println("Main Method" + collageName + s.rollNo + s.name);
		s.displayData();
		displayData1();

		Student.Division sd=new Student.Division();
		sd.displayData2();
	}
}
