package level4;

public class BitConversion_naive_editDistance {
	public int bitSwapRequired(int a, int b) {
		String s1 = Integer.toBinaryString(a), s2 = Integer.toBinaryString(b);
		if (s1.equals(s2))
			return 0;
		// Don't know why equal length is needed
		while (s1.length() < s2.length()) {
			s1 = "0" + s1;
			;
		}
		while (s1.length() > s2.length()) {
			s2 = "0" + s2;
		}
		int l1 = s1.length(), l2 = s2.length(), i, j;
		int[][] memo = new int[l1 + 1][l2 + 1];
		for (i = 1; i <= l1; i++) {
			memo[i][0] = i;
		}
		for (j = 1; j <= l2; j++) {
			memo[0][j] = j;
		}
		for (i = 1; i <= l1; i++) {
			char ch1 = s1.charAt(i - 1);
			for (j = 1; j <= l2; j++) {
				char ch2 = s2.charAt(j - 1);
				if (ch1 == ch2)
					memo[i][j] = memo[i - 1][j - 1];
				else {
					memo[i][j] = Math.min(1 + memo[i - 1][j - 1], Math.min(1 + memo[i][j - 1], 1 + memo[i - 1][j]));
				}
			}
		}
		return memo[i - 1][j - 1];
	}
}
