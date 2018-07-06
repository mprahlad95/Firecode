package level4;

import java.util.*;

public class ReverseLevelOrderTraversal {
	public ArrayList<Integer> levelorderRev(TreeNode root) {
		if (root == null)
			return null;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);
		while (!q.isEmpty()) {
			root = q.remove();
			arr.add(root.data);
			if (root.right != null)
				q.add(root.right);
			if (root.left != null)
				q.add(root.left);
		}
		Collections.reverse(arr);
		return arr;
	}
}
