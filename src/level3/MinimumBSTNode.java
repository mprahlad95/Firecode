package level3;

public class MinimumBSTNode {
	public TreeNode findMin(TreeNode root) {
	    if(root == null) return null;
	    if(root.left != null) root = root.left;
	    return root;
	}
}
