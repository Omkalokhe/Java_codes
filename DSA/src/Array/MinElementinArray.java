package Array;

public class MinElementinArray {
	public static void main(String[] args) {
		int[] a = { 10, 2, 30, 40 };
		int mix = a[0];
		for (int i : a) {
			if (mix > i) {
				mix = i;
			}

		}
		System.out.println(mix);
		
		for (int i = 0; i < a.length; i++) {
			if(mix>a[i]) {
				mix=a[i];
			}
		}
		System.out.println(mix);
	
	}

}
