package Array;

public class DeleteOperation {
	public static void main(String[] args) {
		int[] a = new int[6];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		int pos = 1;
		int n = 4;

		for (int i = pos; i < n; i++) {
			a[i] = a[i + 1];
		}
		n--;
		for (int i = 0; i < n ; i++) {
			System.out.print(a[i] + " ");
		}

	}

}
