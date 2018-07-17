package level5;

import java.util.*;

public class PascalTriangle {
	public static ArrayList<ArrayList<Integer>> generatePascalTriangle(int numRows) {
		ArrayList<ArrayList<Integer>> pascal = new ArrayList<ArrayList<Integer>>();
		if (numRows == 0)
			return pascal;
		int[][] dp = new int[numRows + 1][numRows + 1];
		for (int i = 1; i <= numRows; i++) {
			ArrayList<Integer> level = new ArrayList<>();
			for (int j = 1; j <= i; j++) {
				if (j == 1 || j == i) {
					dp[i][j] = 1;
				} else {
					dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
				}
				level.add(dp[i][j]);
			}
			pascal.add(level);
		}
		return pascal;
	}
}
