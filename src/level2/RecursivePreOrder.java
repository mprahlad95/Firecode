package level2;

import java.util.ArrayList;

public class RecursivePreOrder {
	ArrayList<Integer> preorderedList = new ArrayList<Integer>();
	public void preorder(TreeNode root) {
	   if(root == null) return;
	   preorderedList.add(root.data);
	   preorder(root.left);
	   preorder(root.right);
	}
}
