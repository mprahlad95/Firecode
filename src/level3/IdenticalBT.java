package level3;

public class IdenticalBT {
	public boolean isIdentical(TreeNode root1, TreeNode root2) {
		if (root1 == null && root2 == null)
			return true;
		if ((root1 == null && root2 != null) || (root1 != null && root2 == null))
			return false;
		return (root1.data == root2.data && isIdentical(root1.left, root2.left)
				&& isIdentical(root1.right, root2.right));
	}
}
