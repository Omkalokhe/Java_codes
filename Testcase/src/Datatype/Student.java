package Datatype;

public class Student {

	String name;
	Byte rollNo;
	String email;
	long mobileNo;
	float persantage;
	Boolean pass;

	void data() {

		String name = "Om";
		Byte rollNo = 01;
		String email = "omkalokhe105@gmail.com";
		long mobileNo = 8329752311l;
		float persantage = 81.4f;
		Boolean pass = true;

		System.out.println(name);
		System.out.println(rollNo);
		System.out.println(email);
		System.out.println(mobileNo);
		System.out.println(persantage);
		System.out.println(pass);

	}

	public static void main(String[] args) {
		Student obj = new Student();
		System.out.println(obj.name);
		System.out.println(obj.rollNo);
		System.out.println(obj.email);
		System.out.println(obj.mobileNo);
		System.out.println(obj.persantage);
		System.out.println(obj.pass);

		obj.data();
	}
}
