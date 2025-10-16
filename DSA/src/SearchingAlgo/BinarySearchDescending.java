package SearchingAlgo;

public class BinarySearchDescending {
	public static void main(String[] args) {
		int[] arr = { 90, 80, 70, 60, 50, 40 };
		int target = 50;

		int low = 0, high = arr.length - 1;
		boolean found = false;

		while (low <= high) {
			int mid = (low + high) / 2;

			if (arr[mid] == target) {
				System.out.println("Element " + target + " found at index: " + mid);
				found = true;
				break;
			} else if (arr[mid] > target) {
				low = mid + 1; // for descending, reverse condition
			} else {
				high = mid - 1;
			}
		}

		if (!found) {
			System.out.println("Element " + target + " not found.");
		}
	}
}
