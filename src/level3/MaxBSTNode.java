package level3;

public class MaxBSTNode {
	public TreeNode findMax(TreeNode root) {
	    if(root == null) return null;
	    if(root.right == null) return root;
	    return findMax(root.right);
	}
}
