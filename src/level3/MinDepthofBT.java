package level3;

public class MinDepthofBT {
	public int minTreeDepth(TreeNode root) {
		if (root == null)
			return 0;
		if (root.left == null && root.right == null)
			return 1;
		if (root.left == null)
			return 1 + minTreeDepth(root.right);
		if (root.right == null)
			return 1 + minTreeDepth(root.left);
		return Math.min(minTreeDepth(root.left), minTreeDepth(root.right)) + 1;
	}
}
