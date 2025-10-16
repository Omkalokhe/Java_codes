package SearchingAlgo;

public class LinearSerach {

	public static void main(String[] args) {
		int[] a = { 10, 12, 45, 75, 94 };
		int target = 45;
		for (int i = 0; i < a.length; i++) {
			if (target == a[i]) {
				System.out.println("your Target Elememt found at index " + i);
			}
		}
	}

}
