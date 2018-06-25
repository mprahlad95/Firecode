package level3;

import java.util.*;

public class NumberOfFullNodes {
	public int numberOfFullNodes(TreeNode root) {
		if (root == null)
			return 0;
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);
		int count = 0;
		while (!q.isEmpty()) {
			root = q.remove();
			if (root.left != null)
				q.add(root.left);
			if (root.right != null)
				q.add(root.right);
			if (root.left != null && root.right != null)
				count++;
		}
		return count;
	}
}
