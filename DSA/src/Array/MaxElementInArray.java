package Array;

public class MaxElementInArray {
	
	public static void main(String[] args) {
		int[] a= {10,2,30,40};
		int max=a[0];
		for (int i : a) {
			if(max<i) {
				max=i;
			}
			
		}
		System.out.println(max);
		
		//using for loop
		
		for (int i = 0; i < a.length; i++) {
			if(max<a[i]) {
				max=a[i];
			}
		}
		System.out.println(max);
	}

}
