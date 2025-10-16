package SelectionStatementProgram;
import java.util.Scanner;

// to Check the leap year there is two condition 1) year is dividable by 400 2)year is divide by 4 but not 100 
public class LeapYear {
	Scanner sc=new Scanner(System.in);
	int year=sc.nextInt();
	void checkLeapYear() {
		if(year%400==0 || (year%4==0 && year%100!=0)) {
			System.out.println(year+" Is a Leap Year.");
		}else {
			System.out.println(year+" Is a not Leap Year.");
		}
	}
	public static void main(String[] args) {
		System.out.println("Enter the Year :");
		LeapYear obj=new LeapYear();
		obj.checkLeapYear();
	}
}
