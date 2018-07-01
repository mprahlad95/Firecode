package level3;

public class RotateArrayLeft {
	public static int[] rotateLeft(int[] arr, int k) {
	    k = k % arr.length;
	    for(int i=0;i<k;i++){
	        rotate_one(arr);
	    }
	    return arr;
	}
	public static void rotate_one(int[] arr){
	    int i, temp = arr[0];
	    for(i=0;i<arr.length-1;i++){
	        arr[i]=arr[i+1];
	    }
	    arr[arr.length-1] = temp;
	}
}
