package level3;

public class DiameterOfBST {
	public int diameter(TreeNode root) {
		if (root == null)
			return 0;
		int lheight = height(root.left);
		int rheight = height(root.right);
		int ldia = diameter(root.left);
		int rdia = diameter(root.right);
		int res = Math.max(lheight + rheight + 1, Math.max(ldia, rdia));
		return res;
	}

	public int height(TreeNode root) {
		if (root == null)
			return 0;
		int i = height(root.left);
		int j = height(root.right);
		return (i > j) ? 1 + i : 1 + j;
	}
}
