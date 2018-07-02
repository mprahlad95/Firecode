package level4;

import java.util.*;

public class Level_MaximumSumBT {
	public int findMaxSumLevel(TreeNode root) {
		if (root == null)
			return -1;
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);
		int max = 0, level, sum, i = 0, res = 0;
		while (!q.isEmpty()) {
			level = q.size();
			i++;
			sum = 0;
			while (level-- > 0) {
				root = q.remove();
				sum += root.data;
				if (root.left != null)
					q.add(root.left);
				if (root.right != null)
					q.add(root.right);
			}
			if (sum > max) {
				max = sum;
				res = i - 1;
			}
		}
		return res;
	}
}
