package level3;

import java.util.*;

public class PrintNodesAtoB_BST {
	public ArrayList<Integer> rangeList = new ArrayList<Integer>();

	public void printRange(TreeNode root, int a, int b) {
		if (root == null)
			return;
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);
		while (!q.isEmpty()) {
			root = q.remove();
			if (root.data >= a && root.data <= b)
				rangeList.add(root.data);
			if (root.left != null)
				q.add(root.left);
			if (root.right != null)
				q.add(root.right);
		}
		Collections.sort(rangeList);
	}
}
