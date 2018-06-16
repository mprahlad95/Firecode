package level1;

public class FlipHorizontal {
	public static void flipHorizontalAxis(int[][] matrix) {
		int rows = matrix.length - 1;
		int columns = matrix[0].length;
		for (int i = 0; i <= (rows / 2); i++) {
			for (int j = 0; j < columns; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[rows - i][j];
				matrix[rows - i][j] = temp;
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
		flipHorizontalAxis(matrix);

		for (int i = 0; i < (matrix.length); i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j]);
			}
		}
	}
}
