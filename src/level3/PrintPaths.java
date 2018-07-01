package level3;

import java.util.*;

public class PrintPaths {
	public ArrayList<String> printPaths(char[][] board) {
		ArrayList<String> out = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		search(0, 0, board, sb, out);
		return out;
	}

	public void search(int i, int j, char[][] board, StringBuilder sb, ArrayList<String> out) {
		int rows = board.length;
		int cols = board[0].length;
		if (i > rows - 1 || j > cols - 1)
			return;

		sb.append(board[i][j]); // Mark
		if (i == rows - 1 && j == cols - 1) {
			out.add(sb.toString());
			sb.deleteCharAt(sb.length() - 1);
			return;
		}
		search(i + 1, j, board, sb, out); // Search Down
		search(i, j + 1, board, sb, out); // Search Right
		sb.deleteCharAt(sb.length() - 1); // Un-Mark
	}
}
