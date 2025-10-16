package NumberGusseingTask;

import java.util.Random;
import java.util.Scanner;

public class NumberGusseingGame {
	public static void main(String[] args) {
//		Random rn=new Random();  // Random class use for generate the random number.
		Scanner sc=new Scanner(System.in);
//		int correctNumber=rn.nextInt(100);
		int correctNumber=10;
		boolean flag=true;
		System.out.println("Enter Your Guess Number:");
		while(flag) {
			
			int num=sc.nextInt();
			if(num>correctNumber) {
				System.out.println("Guess Number is Greater than the correct number.");
			}else if(num<correctNumber) {
				System.out.println("Guess Number is Less than the correct number.");
			}else if(num==correctNumber) {
				flag=false;
				System.out.println("Congrulation you Guess the Correct Number.");
				System.out.println("Program end");
			}
				
			
		}
	}

}
