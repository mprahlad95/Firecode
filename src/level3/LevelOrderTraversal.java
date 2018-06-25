package level3;

import java.util.*;

public class LevelOrderTraversal {
	public ArrayList<Integer> levelorder(TreeNode root) {
		if (root == null)
			return null;
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		q.add(root);
		while (!q.isEmpty()) {
			root = q.remove();
			arr.add(root.data);
			if (root.left != null)
				q.add(root.left);
			if (root.right != null)
				q.add(root.right);
		}
		return arr;
	}
}
