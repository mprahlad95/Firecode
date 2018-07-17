package level5;

public class BinarySearch_recursive {
	public static Boolean binarySearch(int[] arr, int n) {
		if (arr.length == 0 || arr == null)
			return false;
		return helper(arr, n, 0, arr.length - 1);
	}

	public static Boolean helper(int[] arr, int n, int low, int high) {
		if (low > high)
			return false;
		int mid = (low + high) / 2;
		if (n == arr[mid]) {
			return true;
		}
		if (n < arr[mid]) {
			return helper(arr, n, low, mid - 1);
		}
		return helper(arr, n, mid + 1, high);
	}
}
