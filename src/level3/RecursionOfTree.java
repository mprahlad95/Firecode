package level3;

	public class RecursionOfTree {
		private TreeNode root;
		public int findMax(TreeNode root) {
			if (root.left == null || root.right == null)
				return root.data;
			int res = root.data;
			int lmax = findMax(root.left);
			int rmax = findMax(root.right);
			if (lmax > res)
				res = lmax;
			if (rmax > res)
				res = rmax;
			return res;
		}
	    /* Driver program to test above functions */
	    public static void main(String args[])
	    {
	    	RecursionOfTree tree = new RecursionOfTree();
	        tree.root = new TreeNode(2, null, null);
	        tree.root.left = new TreeNode(7, null, null);
	        tree.root.right = new TreeNode(5, null, null);
	        tree.root.left.right = new TreeNode(6, null, null);
	        tree.root.left.right.left = new TreeNode(1, null, null);
	        tree.root.left.right.right = new TreeNode(11, null, null);
	        tree.root.right.right = new TreeNode(9, null, null);
	        tree.root.right.right.left = new TreeNode(4, null, null);
	 
	        System.out.println("Maximum element is " +
	                         tree.findMax(tree.root));
	    }
	}

	
