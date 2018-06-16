package level1;

public class FlipVertical {
	public static void flipVerticalAxis(int[][] matrix) {
		int rows = matrix.length;
		int columns = matrix[0].length - 1;
		int temp;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j <= columns / 2; j++) {
				temp = matrix[i][j];
				matrix[i][j] = matrix[i][columns - j];
				matrix[i][columns - j] = temp;
			}
		}
	}

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		for (int i = 0; i < (matrix.length); i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j]);
			}
		}
		System.out.println();
		flipVerticalAxis(matrix);

		for (int i = 0; i < (matrix.length); i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j]);
			}
		}
	}
}
