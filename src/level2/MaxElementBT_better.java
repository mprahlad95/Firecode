package level2;

public class MaxElementBT_better {
	public int findMax(TreeNode root) {
		if (root == null)
			return Integer.MIN_VALUE;
		return Math.max(root.data, Math.max(findMax(root.left), findMax(root.right)));
	}
}
