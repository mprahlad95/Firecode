package level2;

import java.util.ArrayList;
import java.util.Stack;

public class IterativePreOrderTraversal {
	public ArrayList<Integer> preorderItr(TreeNode root) {
	    Stack<TreeNode> s = new Stack<TreeNode>();
	    ArrayList<Integer> arr = new ArrayList<Integer>();
	    if(root == null) return arr;
	    s.push(root);
	    while(!s.isEmpty()){
	        root = s.pop();
	        arr.add(root.data);
	        if(root.right != null) s.push(root.right);
	        if(root.left != null) s.push(root.left);
	    }
	    return arr;
	}
}
