package level3;

import java.util.*;

public class IterativeInorderBST {
	public ArrayList<Integer> inorderItr(TreeNode root) {
	    Stack<TreeNode> s = new Stack<TreeNode>();
	    ArrayList<Integer> arr = new ArrayList<Integer>();
	    while(root != null || !s.isEmpty()){
	        if(root != null){
	            s.push(root);
	            root = root.left;
	        }
	        else {
	            root = s.pop();
	            arr.add(root.data);
	            root = root.right;
	        }
	    } 
	    return arr;
	}
}
