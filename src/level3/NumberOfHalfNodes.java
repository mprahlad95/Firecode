package level3;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfHalfNodes {
	public int numberOfHalfNodes(TreeNode root) { 
	    if(root == null) return 0;
	    Queue<TreeNode> q = new LinkedList<TreeNode>();
	    q.add(root);
	    int count = 0;
	    while(!q.isEmpty()){
	        root = q.remove();
	        if(root.left == null || root.right == null) if(!(root.left == null && root.right == null)) count++;
	        if(root.left != null) q.add(root.left);
	        if(root.right != null) q.add(root.right);
	    }
	    return count;
	}
}
