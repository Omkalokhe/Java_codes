package recussion;

public class SwapArrayElement {
	
	
	void swapArray(int[] arr,int start,int end) {
		
		if(start>end) {
			return ;
		}
		int temp=arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
		swapArray(arr, start+1, end-1);
	}

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		
		SwapArrayElement obj=new SwapArrayElement();
		
		obj.swapArray(arr, 0, arr.length-1);
		
		for ( int i : arr) {
			System.out.println(i);
		}
	}
}
