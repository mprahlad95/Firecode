package level4;

public class CoinChangeDP {
	public static int makeChange(int[] coins, int amount) {
		if (amount <= 0 || coins == null)
			return 0;
		int[][] dp = new int[coins.length + 1][amount + 1];
		for (int i = 0; i <= coins.length; i++) {
			dp[i][0] = 1;
		}
		for (int j = 1; j <= amount; j++) {
			dp[0][j] = 0;
		}
		dp[0][0] = 1;
		for (int i = 1; i <= coins.length; i++) {
			for (int j = 0; j <= amount; j++) {
				if (j < coins[i - 1]) {
					dp[i][j] = dp[i - 1][j];
				} else if (j >= coins[i - 1]) {
					dp[i][j] = dp[i][j - coins[i - 1]] + dp[i - 1][j];
				}
			}
		}
		return dp[coins.length][amount];
	}
}
