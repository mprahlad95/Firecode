package level3;

import java.util.LinkedList;
import java.util.Queue;

public class MaxElementBTIterative {
	public int findMaxItr(TreeNode root) {
	    TreeNode current;
	    Queue<TreeNode> q = new LinkedList<TreeNode>();
	    q.add(root);
	    int max = 0;
	    while(!q.isEmpty()){
	        current = q.remove();
	        if(current.data > max) max = current.data;
	        if(current.left != null) q.add(current.left);
	        if(current.right != null) q.add(current.right);
	    }
	    return max;
	}
}
