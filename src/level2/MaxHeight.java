package level2;

public class MaxHeight {
	public int findHeight(TreeNode root) { 
	    if(root == null) return 0;
	    int i = findHeight(root.left);
	    int j = findHeight(root.right);
	    return (i > j) ? i + 1 : j + 1;
	}
}
