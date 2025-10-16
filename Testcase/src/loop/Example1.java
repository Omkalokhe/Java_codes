package loop;

import java.util.Scanner;

public class Example1 {
	// hello print using while when user give 0 then it will printing stop
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number ");
		int n = sc.nextInt();
		while (n > 0) {
			System.out.println("Hello");
			n--;
		}
		do {
			System.out.println("Hello");	
		}while(n>0);
	}

}
