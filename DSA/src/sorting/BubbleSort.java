package sorting;

public class BubbleSort {
     // for the numnerical sorting
	public static void main(String[] args) {
		int[] a = { 10, 78, 1, 954, 3, 745, 16 };
		int temp;
		
		for (int i = 0; i < a.length; i++) {
			int flag = 0;
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j + 1];
					a[j + 1] = a[j];
					a[j] = temp;
					flag = 1;
				}

			}
			if (flag==0) {
				break;
			}

		}
		for (int i : a) {
			System.out.print(i + " ");
		}
	}

}
