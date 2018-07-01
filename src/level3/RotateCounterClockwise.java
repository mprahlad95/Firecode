package level3;

public class RotateCounterClockwise {
	public static void rotateSquareImageCCW(int[][] matrix) {
		int rows = matrix.length, cols = matrix[0].length, i, j, temp;
		for (i = 0; i < rows; i++) {
			for (j = i + 1; j < cols; j++) {
				temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
		for (i = 0; i < rows / 2; i++) {
			for (j = 0; j < cols; j++) {
				temp = matrix[i][j];
				matrix[i][j] = matrix[rows - i - 1][j];
				matrix[rows - i - 1][j] = temp;
			}
		}
	}
}
