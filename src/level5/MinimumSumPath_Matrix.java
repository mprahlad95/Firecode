package level5;

public class MinimumSumPath_Matrix {
	public static int minWeightedPath(int[][] grid) {
		if (grid == null || grid.length == 0)
			return 0;
		int[][] dp = new int[grid.length + 1][grid[0].length];
		dp[0][0] = grid[0][0];
		for (int i = 1; i < grid[0].length; i++) {
			dp[0][i] = dp[0][i - 1] + grid[0][i];
		}
		for (int j = 1; j < grid.length; j++) {
			dp[j][0] = dp[j - 1][0] + grid[j][0];
		}
		for (int i = 1; i < grid.length; i++) {
			for (int j = 1; j < grid[0].length; j++) {
				dp[i][j] = grid[i][j] + Math.min(dp[i][j - 1], dp[i - 1][j]);
			}
		}
		return dp[grid.length - 1][grid[0].length - 1];
	}
}
