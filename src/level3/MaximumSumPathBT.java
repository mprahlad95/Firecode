package level3;

public class MaximumSumPathBT {
	public static int maxSumPath(TreeNode root) {
		int max[] = new int[1];
		max[0] = 0;
		calculateSum(root, max);
		return max[0];
	}

	public static int calculateSum(TreeNode root, int[] max) {
		if (root == null)
			return 0;
		int left = calculateSum(root.left, max);
		int right = calculateSum(root.right, max);
		int current = Math.max(root.data, Math.max(root.data + left, root.data + right));
		max[0] = Math.max(max[0], Math.max(current, left + root.data + right));
		return current;
	}
}