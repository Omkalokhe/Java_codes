package Array;

public class ArraysDataRetreivel {

	public static void main(String[] args) {
		int [] a=new int[6];
		a[0]=10;
		a[1]=10;
		a[2]=10;
		a[3]=10;
		a[4]=10;
		System.out.println(a.length);
		int[] a1= {10,20,30,40,50};
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+",");
		}
	}
}
