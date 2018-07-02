package level4;

public class MirrorBinaryTree {
	public boolean isMirror(TreeNode root1, TreeNode root2) {
		if (root1 == null && root2 == null)
			return true;
		if (root1 == null || root2 == null)
			return false;
		return root1.data == root2.data && isMirror(root1.left, root2.right) && isMirror(root1.right, root2.left);
	}
}
