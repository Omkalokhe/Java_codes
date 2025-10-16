package sorting;

public class BubbleSortonString {

	public static void main(String[] args) {
		String[] a = {"Om","Anjali","Dipali","Mayur","Rohini"};
		String temp;
		
		for (int i = 0; i < a.length; i++) {
			int flag = 0;
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j].compareTo(a[j+1])>0) {
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
		for (String i : a) { 
			System.out.print(i + " ");
		}
	}
}
