package level4;

public class SubsetSum_DP {
	public static boolean groupSum(int[] arr, int target) {
		if (arr == null)
			return false;
		boolean[][] dp = new boolean[arr.length + 1][target + 1];
		for (int i = 0; i <= arr.length; i++) {
			dp[i][0] = true;
		}
		for (int j = 1; j <= target; j++) {
			dp[0][j] = false;
		}
		for (int i = 1; i <= arr.length; i++) {
			for (int j = 1; j <= target; j++) {
				if (i > j)
					dp[i][j] = dp[i - 1][j];
				if (i == j)
					dp[i][j] = true;
				else {
					dp[i][j] = dp[i - 1][j] || dp[i - 1][j - i];
				}
			}
		}
		return dp[arr.length][target];
	}
}
