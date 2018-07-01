package level3;

import java.util.*;

public class PrintPathsSimple {
	public ArrayList<String> printPaths(char[][] board) {
		ArrayList<String> result = new ArrayList<String>();
		if (board.length != 0 && board[0].length != 0)
			helper(result, "", 0, 0, board);
		return result;
	}

	private void helper(ArrayList<String> result, String str, int i, int j, char[][] board) {
		str += board[i][j];
		if (i == board.length - 1 && j == board[0].length - 1)
			result.add(str);
		else {
			if (i < board.length - 1)
				helper(result, str, i + 1, j, board);
			if (j < board[0].length - 1)
				helper(result, str, i, j + 1, board);
		}
	}
}
