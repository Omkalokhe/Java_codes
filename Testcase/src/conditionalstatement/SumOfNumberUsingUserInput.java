package conditionalstatement;

import java.util.Scanner;

public class SumOfNumberUsingUserInput {
	/*
	 * Write a program that keeps taking input from the user until the user enters
	 * 0. When the user enters 0, stop taking input and print the sum of all the
	 * entered numbers.
	 */
	public static void main(String[] args) {

		boolean flag = true;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Continueslly Enter the numbers that you need to make Sum:");
		System.out.println("If you need to end the Program press 0");
		while (flag) {

			int num = sc.nextInt();
			sum += num;

			if (num == 0) {
				flag = false;
				System.out.println("Program is End.....");
			}

		}
		System.out.println("The Sum of above all Number is " + sum);

	}
}
