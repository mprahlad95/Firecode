package level3;

import java.util.*;

public class kthSmallestNodeBST {
	public TreeNode findKthSmallest(TreeNode root, int k) {
		if (root == null)
			return null;
		Stack<TreeNode> s = new Stack<TreeNode>();
		while (!s.isEmpty() || root != null) {
			if (root != null) {
				s.push(root);
				root = root.left;
			} else {
				root = s.pop();
				if (k-- == 1)
					break;
				root = root.right;
			}
		}
		return root;
	}
}
