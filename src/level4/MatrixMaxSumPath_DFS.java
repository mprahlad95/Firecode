package level4;

public class MatrixMaxSumPath_DFS {
	public static int matrixMaxSumDfs(int[][] grid) {
		int rows = grid.length, cols = grid[0].length;
		int max = 0;
		for (int i = 0; i < cols; i++)
			max = Math.max(max, grid[0][i]);

		for (int i = 1; i < rows; i++) {
			max = 0;
			for (int j = 0; j < cols; j++) {
				if (j > 0)
					grid[i][j] += Math.max(grid[i - 1][j], grid[i][j - 1]);
				else {
					grid[i][j] += grid[i - 1][j];

				}
				max = Math.max(grid[i][j], max);
			}
		}
		return max;
	}
}
