package level4;

import java.util.*;

public class MinimumSumPathTriangle {
	public static int minTriangleDepth(ArrayList<ArrayList<Integer>> input) {
		if (input == null)
			return 0;
		int level = input.size() - 1;
		int dp[][] = new int[level + 1][level + 1];
		for (int i = 0; i <= level; i++) {
			dp[level][i] = input.get(level).get(i);
		}
		level--;
		for (; level >= 0; level--) {
			for (int j = 0; j <= level; j++) {
				int val = input.get(level).get(j);
				dp[level][j] = val + Math.min(dp[level + 1][j], dp[level + 1][j + 1]);
			}
		}
		return dp[0][0];
	}
}
