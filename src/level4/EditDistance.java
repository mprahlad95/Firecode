package level4;

public class EditDistance {
	public int editDistance(String a, String b) {
		if (a.equals(b))
			return 0;
		int lenA = a.length(), lenB = b.length(), i, j;
		int memo[][] = new int[lenA + 1][lenB + 1];
		for (i = 1; i <= lenA; i++)
			memo[i][0] = i;
		for (j = 1; j <= lenB; j++)
			memo[0][j] = j;
		for (i = 1; i <= lenA; i++) {
			char chA = a.charAt(i - 1);
			for (j = 1; j <= lenB; j++) {
				char chB = b.charAt(j - 1);
				if (chA == chB)
					memo[i][j] = memo[i - 1][j - 1];
				else
					memo[i][j] = (int) Math.min(1 + memo[i - 1][j - 1],
							Math.min(1 + memo[i][j - 1], 1 + memo[i - 1][j]));
			}
		}
		return memo[i - 1][j - 1];
	}
}
