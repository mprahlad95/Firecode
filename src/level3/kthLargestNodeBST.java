package level3;

public class kthLargestNodeBST {
	public TreeNode findKthLargest(TreeNode root, int k) {
	    if(root == null) return null;
	    int right_size = size(root.right);
	    if(right_size+1 == k) return root;
	    if(k <= right_size) return findKthLargest(root.right, k);
	    return findKthLargest(root.left, k-right_size-1);
	}
	public int size(TreeNode root) {
		if (root == null) return 0;
		return 1 + size(root.left) + size(root.right);
	    }
}
