package level4;

public class DistanceBetweenTwoNodesBT {
	public int getNodeDistance(TreeNode root, int n1, int n2) {
		if (root == null)
			return 0;
		TreeNode LCA = findLCA(root, n1, n2);
		// distance from LCA to n1 & n2
		return distance(LCA, n1) + distance(LCA, n2);
	}

	public TreeNode findLCA(TreeNode root, int n1, int n2) {
		if (root == null)
			return null;
		if (root.data == n1 || root.data == n2)
			return root;
		TreeNode left = findLCA(root.left, n1, n2);
		TreeNode right = findLCA(root.right, n1, n2);
		if (left != null && right != null)
			return root;
		return (left != null) ? left : right;
	}

	public int distance(TreeNode root, int n) {
		if (root == null)
			return -1;
		int dist = -1;
		if ((root.data == n) || (dist = distance(root.left, n)) >= 0 || (dist = distance(root.right, n)) >= 0)
			return dist + 1;
		return -1;
	}
}
