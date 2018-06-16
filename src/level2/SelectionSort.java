package level2;

public class SelectionSort {
	public static int[] selectionSortArray(int[] arr){
	    int len = arr.length;
	    int min;
	    for(int i=0;i<len;i++){
	        min = i;
	        for(int j=i+1;j<len;j++){
	            if(arr[j] < arr[min]){
	                min = j;
	            }
	            int temp = arr[min];
	            arr[min]=arr[i];
	            arr[i]=temp;
	        }
	    }
	    return arr;
	}
}
