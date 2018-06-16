package level2;

public class CoupleSum {
	public static int[] coupleSum(int[] numbers, int target) {
	    int arr[] = new int[2];
	    for(int i = 0;i<numbers.length-1;i++){
	        if(numbers[i] + numbers[i+1] == target){
	            arr[0] = i+1;
	            arr[1] = i+2;
	            return arr;
	        }
	    }
	    return null;
	}
}
