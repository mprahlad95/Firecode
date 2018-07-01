package level3;

import java.util.*;

public class TreeDecomposition {
	public TreeNode decompressTree(String str) {
		if (str.equals("*") || str == null)
			return null;
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		String[] nodes = str.split(",");
		for (String s : nodes) {
			if (!s.equals("*"))
				arr.add(Integer.valueOf(s));
			else
				arr.add(null);
		}
		TreeNode root = new TreeNode(arr.get(0));
		q.add(root);
		int i = 0, length = arr.size();
		while (i < length) {
			TreeNode node = q.poll();
			if (node != null) {
				Integer left_val = (i + 1 < length) ? arr.get(i + 1) : null;
				Integer right_val = (i + 2 < length) ? arr.get(i + 2) : null;
				TreeNode left_child = (left_val != null) ? new TreeNode(left_val) : null;
				TreeNode right_child = (right_val != null) ? new TreeNode(right_val) : null;
				node.left = left_child;
				node.right = right_child;
				q.add(node.left);
				q.add(node.right);
			}
			i += 2;
		}
		return root;
	}
}
