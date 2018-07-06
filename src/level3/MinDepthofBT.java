   package level3;

public class MinDepthofBT {
	public int minTreeDepth(TreeNode root) {
	    if(root==null) return 0;
	    return Math.min(1+minTreeDepth(root.left),1+minTreeDepth(root.right));
	}
}
