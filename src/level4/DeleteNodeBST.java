package level4;

public class DeleteNodeBST {
	public TreeNode delete(TreeNode root, int data) {
		if (root == null)
			return null;
		if (data == root.data) {
			if (root.left == null && root.right == null)
				root = null;
			else if (root.left != null && root.right != null) {
				root.data = min(root.right).data;
				root.right = delete(root.right, root.data);
			} else if (root.right == null)
				root = root.left;
			else if (root.left == null)
				root = root.right;
		} else if (data < root.data)
			root.left = delete(root.left, data);
		else if (data > root.data)
			root.right = delete(root.right, data);
		return root;
	}

	public TreeNode min(TreeNode root) {
		if (root.left == null)
			return root;
		return min(root.left);
	}
}
