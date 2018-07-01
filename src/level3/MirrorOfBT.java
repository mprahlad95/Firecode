package level3;

public class MirrorOfBT {
	public TreeNode mirror(TreeNode root) {
	    if(root == null) return null;
	    TreeNode left = mirror(root.left);
	    TreeNode right = mirror(root.right);
	    root.left = right;
	    root.right = left;
	    return root;
	}
}
