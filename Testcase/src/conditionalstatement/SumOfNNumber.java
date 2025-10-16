package conditionalstatement;

import java.util.Scanner;

//Sum of First N Numbers Input n and calculate the sum 1 + 2 + … + n.


public class SumOfNNumber {
		
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number you to need to sum upto: ");
		int num=sc.nextInt();
		int sum=0;
		for(int i=0;i<=num;i++) {
			 sum += i;
		}
		System.out.println("Sum of Numbers is "+sum);
	}
}
