package recussion;

public class PrintNumberNTo1 {
	void printNumber(int i, int n) {
		if (n < i) {
			return;
		}
		System.out.println(n);
		printNumber(i, n - 1);

	}

	public static void main(String[] args) {
		PrintNumberNTo1 obj = new PrintNumberNTo1();
		obj.printNumber(1, 5);
	}

}
