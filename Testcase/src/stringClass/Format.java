package stringClass;

public class Format {
		public static void main(String[] args) {
			  String name = "Om";
		        int age = 22;
		        double gpa = 8.44;

		        String formatted = String.format("Name: %s | Age: %d | GPA: %.2f", name, age, gpa);
		        System.out.println(formatted);
		    
		}
}
