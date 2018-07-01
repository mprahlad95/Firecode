package level3;

import java.util.*;

public class PrintLevelOrderTraversalBT {
	public ArrayList<ArrayList<Integer>> printLevelByLevel(TreeNode root) {
		ArrayList<Integer> current_level = new ArrayList<Integer>();
		ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
		if (root == null)
			return arr;
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);
		int level = 1, count = 1;
		while (!q.isEmpty()) {
			if (count <= level) {
				root = q.remove();
				current_level.add(root.data);
				if (root.left != null)
					q.add(root.left);
				if (root.right != null)
					q.add(root.right);
				count++;
			} else {
				arr.add(current_level);
				current_level = new ArrayList<Integer>();
				count = 1;
				level = level * 2;

			}
		}
		arr.add(current_level);
		return arr;
	}
}
