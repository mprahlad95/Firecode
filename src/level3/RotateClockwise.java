package level3;

public class RotateClockwise {
	public static void rotateSquareImageCW(int[][] matrix) {
	    int rows = matrix.length, cols = matrix[0].length;
	    for(int i=0;i<rows;i++){
	        for(int j=i+1;j<cols;j++){
	            int temp = matrix[i][j];
	            matrix[i][j]=matrix[j][i];
	            matrix[j][i]=temp;
	            }
	        }
	        for(int i=0;i<rows;i++){
	            for(int j=0;j<cols/2;j++){
	                int temp = matrix[i][j];
	                matrix[i][j]=matrix[i][cols-j-1];
	                matrix[i][cols-j-1]=temp;
	            }
	        }
	    }
}
