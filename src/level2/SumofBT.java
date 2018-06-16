package level2;

public class SumofBT {
	public int sum(TreeNode root) { 
	    if(root == null) return 0;
	    return sum(root.left) + root.data + sum(root.right); 
	}
}
