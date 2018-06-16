package level2;

import java.util.Arrays;

public class MergeTwoSortedArrays_me {
	public static int[] merge(int[] arrLeft, int[] arrRight){
	    int l1 = arrLeft.length;
	    int l2 = arrRight.length;
	    int j = 0;
	    int arr[] = new int[l1+l2];
	    for(int i = 0;i <l1+l2;i++){
	        if(i<l1) arr[i] = arrLeft[i];
	        else arr[i] = arrRight[j++];
	    }
	    Arrays.sort(arr);
	    return arr;
	}
}
