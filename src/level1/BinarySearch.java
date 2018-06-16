package level1;

public class BinarySearch {
	public static Boolean binarySearch(int[] arr, int n){
		  int mid, high=arr.length, low=0;
		  Boolean flag = false;
		  for(int i=0;i<arr.length;i++){
		      mid = (high + low / 2)-1;
		      if(n<arr[mid])
		          high = mid;
		          if(n>arr[mid]) 
		          low = mid;
		          if(n==arr[mid]) {
		              flag = true;
		              break;
		          }
		  }
		  return flag;
		}
}
