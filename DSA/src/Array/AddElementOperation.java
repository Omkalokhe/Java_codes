package Array;

public class AddElementOperation {
	public static void main(String[] args) {
		int[] a = new int[6];
		a[0] = 10;
		a[1] = 30;
		a[2] = 40;
		a[3] = 50;
		int n = 4;
		int pos = 1;
		int value = 20;

		for (int i = n; i > pos; i--) {
			a[i] = a[i - 1];
		}

		a[pos] = value;
		n++;

		// Print array
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}

	}
}
