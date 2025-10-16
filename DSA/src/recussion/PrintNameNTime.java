package recussion;

public class PrintNameNTime {

	void printName(int i, int n) {
		if (i > n) {
			return;
		}
		System.out.println("Hello");
		printName(i + 1, n);

	}

	public static void main(String[] args) {
		PrintNameNTime obj = new PrintNameNTime();
		obj.printName(1, 2);
	}

}
