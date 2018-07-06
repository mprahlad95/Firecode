package level4;

public class MatrixMaxSumPath_DP {
	public static int matrixMaxSumDP(int[][] grid) {
		if (grid == null)
			return 0;
		int rows = grid.length, cols = grid[0].length;
		int dp[][] = new int[rows + 1][cols + 1];
		for (int i = 0; i <= rows; i++)
			dp[i][0] = 0;
		for (int j = 0; j <= cols; j++)
			dp[0][j] = 0;
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= cols; j++) {
				dp[i][j] = grid[i - 1][j - 1] + Math.max(dp[i - 1][j], dp[i][j - 1]);
			}
		}
		return dp[rows][cols];
	}
}
