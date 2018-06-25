package level3;

import java.util.ArrayList;

public class Snake {
	public static ArrayList<Integer> findSpiral(int[][] arr) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if (arr.length == 0) {
            return result;
        }
        
        int leftBound = 0;
        int rightBound = arr[0].length - 1;
        int bottomBound = arr.length - 1;
        int upperBound = 0;
        
        while (leftBound <= rightBound && upperBound <= bottomBound) {
            for (int col = leftBound; col <= rightBound; col++) {
                result.add(arr[upperBound][col]);
            }
            upperBound++;
            
            for (int row = upperBound; row <= bottomBound; row++) {
                result.add(arr[row][rightBound]);
            }
            rightBound--;
            
            for (int col = rightBound; upperBound <= bottomBound && col >= leftBound; col--) {
                result.add(arr[bottomBound][col]);
            }
            bottomBound--;
            
            for (int row = bottomBound; leftBound <= rightBound && row >= upperBound; row--) {
                result.add(arr[row][leftBound]);
            }
            leftBound++;
        }
        
        return result;
}
}
