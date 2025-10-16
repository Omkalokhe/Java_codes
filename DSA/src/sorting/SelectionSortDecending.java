package sorting;

public class SelectionSortDecending {
	public static void main(String[] args) {
		int[] a = { 50, 45, 88, 957, 11, 10, 3, 2, 3, 11 };

		for (int i = 0; i < a.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] > a[minIndex]) {
					minIndex = j;
				}
			}
			int temp = a[minIndex];
			a[minIndex] = a[i];
			a[i] = temp;
		}
		System.out.println("Sorted Array :");
		for (int num : a) {
			System.out.print(num + ",");
		}
	}
}
