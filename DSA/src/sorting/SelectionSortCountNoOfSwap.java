package sorting;

public class SelectionSortCountNoOfSwap {
	public static void main(String[] args) {
		int[] a = { 5, 4, 3, 2, 1 };
		int swap = 0;
		for (int i = 0; i < a.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[minIndex]) {
					minIndex = j;
				}
			}
			if (minIndex != i) {
				int temp = a[minIndex];
				a[minIndex] = a[i];
				a[i] = temp;
				swap++;
			}
		}
		System.out.println("Sorted Array :");
		for (int num : a) {
			System.out.print(num + ",");
		}
		System.out.println();
		System.out.println("Number of Swap Required is " + swap);
	}
}
