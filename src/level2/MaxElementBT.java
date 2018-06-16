package level2;

public class MaxElementBT {
	public int findMax(TreeNode root) {
		if (root.left == null || root.right == null)
			return root.data;
		int res = root.data;
		int lmax = findMax(root.left);
		int rmax = findMax(root.right);
		if (lmax > res)
			res = lmax;
		if (rmax > res)
			res = rmax;
		return res;
	}
}
