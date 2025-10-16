package SelectionStatementProgram;
import java.util.Scanner;
public class EvenOdd {
	Scanner sc=new Scanner (System.in);
	int num=sc.nextInt();
	void checkEvenOdd() {
		if(num%2==0) {
			System.out.println(num+" is Even Number.");
		}else {
			System.out.println(num+" is Odd Number.");
		}
	}
	public static void main(String[] args) {
		System.out.println("Enter Number: ");
		EvenOdd obj=new EvenOdd();
		obj.checkEvenOdd();
	}
		
}