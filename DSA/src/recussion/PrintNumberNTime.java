package recussion;

public class PrintNumberNTime {

	void printName(int i, int n) {
		if (i > n) {
			return;
		}
		System.out.println(i);
		printName(i + 1, n);

	}

	public static void main(String[] args) {
		PrintNumberNTime obj = new PrintNumberNTime();
		obj.printName(1, 5);
	}

}
