package level4;

public class LowestCommonAncestorBT {
	public TreeNode findLCA(TreeNode root, TreeNode a, TreeNode b) {
		if (root == null)
			return null;
		if (root == a || root == b)
			return root;
		TreeNode left = findLCA(root.left, a, b);
		TreeNode right = findLCA(root.right, a, b);
		if (left != null && right != null)
			return root;
		return (left != null) ? left : right; //Handle condition if a or b is not present
	}
}
