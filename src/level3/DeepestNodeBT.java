package level3;

import java.util.*;

public class DeepestNodeBT {
	public TreeNode findDeepest(TreeNode root) {
		if (root == null)
			return null;
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);
		while (!q.isEmpty()) {
			root = q.remove();
			if (root.left != null)
				q.add(root.left);
			if (root.right != null)
				q.add(root.right);
		}
		return root;
	}
}
