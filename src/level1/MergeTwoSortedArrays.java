package level1;

public class MergeTwoSortedArrays {
	public static int[] merge(int[] arrLeft, int[] arrRight){
        // Grab the lengths of the left and right arrays
        int lenLeft = arrLeft.length;
        int lenRight = arrRight.length;
        // Create a new output array with the size = sum of the lengths of left and right
        // arrays
        int[] arrMerged = new int[lenLeft+lenRight];
        // Maintain 3 indices, one for the left array, one for the right and one for 
        // the merged array
        int indLeft = 0, indRight = 0, indMerged = 0;
        // While neither array is empty, run a while loop to merge
        // the smaller of the two elements, starting at the leftmost position of 
        // both arrays
        while(indLeft < lenLeft && indRight < lenRight){
            if(arrLeft[indLeft] < arrRight[indRight])
                arrMerged[indMerged++] = arrLeft[indLeft++];
            else
                arrMerged[indMerged++] = arrRight[indRight++];
        }
        // Another while loop for when the left array still has elements left
        while(indLeft < lenLeft){
            arrMerged[indMerged++] = arrLeft[indLeft++];
        }
        // Another while loop for when the right array still has elements left
        while(indRight < lenRight){
            arrMerged[indMerged++] = arrRight[indRight++];
        }
        return arrMerged;
    }
}
