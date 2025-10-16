package sorting;

public class BubbleSortCountNoOfSwap {
	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 5 };
		int temp;
		int swap = 0;
		for (int i = 0; i < a.length; i++) {
			int flag = 0;
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					swap++;
					temp = a[j + 1];
					a[j + 1] = a[j];
					a[j] = temp;
					flag = 1;
				}

			}
			if (flag == 0) {
				break;
			}

		}
		for (int i : a) {
			System.out.print(i + " ");
		}
		System.out.println("");
		System.out.println("Number of Swap Required is " + swap);
	}
}
