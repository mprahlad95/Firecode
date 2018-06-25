package level3;

import java.util.*;

public class IterativeBSTvalidation {
	//Inorder traversal -> copy, sort and compare arraylist
	public static boolean validateBSTItr(TreeNode root) {
	    ArrayList<Integer> arr = new ArrayList<Integer>();
	    Stack<TreeNode> s = new Stack<TreeNode> ();
	    while(!s.isEmpty() || root != null){
	        if(root != null) {
	            s.push(root);
	            root = root.left;
	        }
	        else {
	            root = s.pop();
	            arr.add(root.data);
	            root = root.right;
	        }
	    }
	    ArrayList<Integer> sorted_arr = new ArrayList<Integer>(arr);
	    Collections.sort(sorted_arr);
	    return (sorted_arr.equals(arr));
	}
}
