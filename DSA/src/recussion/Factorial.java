package recussion;

public class Factorial {
	int factorial = 1;

	int factorial(int i, int n) {
		if (i > n) {
			return 0;
		}
		factorial *= i;
		factorial(i + 1, n);
		return factorial;
	}

	public static void main(String[] args) {
		Factorial obj = new Factorial();
		int result=obj.factorial(1, 3);
		System.out.println("Factorial is " + result);
	}
}
