package level2;

import java.util.LinkedList;
import java.util.Queue;

public class FindNodeNoRecursion {
	public TreeNode findNode(TreeNode root, int val) {
		if (root == null)
			return null;
		TreeNode current = null;
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);
		while (!q.isEmpty()) {
			current = q.remove();
			if (current.data == val)
				return current;
			if (current.left != null)
				q.add(current.left);
			if (current.right != null)
				q.add(current.right);
		}
		return null;
	}
}
