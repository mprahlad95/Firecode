package level2;

public class Transpose2DMatrix {
	public static void transposeMatrix(int[][] matrix) {
		int temp;
		for (int i = 0; i < (matrix.length / 2) + 1; i++) {
			for (int j = i; j < matrix[0].length; j++) {
				temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
	}
}
