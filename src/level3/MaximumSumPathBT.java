package level3;

public class MaximumSumPathBT {
	public static int maxSumPath(TreeNode root) {
		int[] maxRecursiveHolder = new int[1];
		maxSumPathMain(root, maxRecursiveHolder);
		return maxRecursiveHolder[0];
	}

	public static int maxSumPathMain(TreeNode root, int[] maxRecursiveHolder) {
		if (root == null)
			return 0;
		int leftSum = maxSumPathMain(root.left, maxRecursiveHolder);
		int rightSum = maxSumPathMain(root.right, maxRecursiveHolder);
		// Get the max path sum up to this node, including this node's value
		int nodeCumVal = Math.max(root.data + leftSum, root.data + rightSum);
		// Check and update the max holder
		maxRecursiveHolder[0] = Math.max(maxRecursiveHolder[0], leftSum + root.data + rightSum);
		return nodeCumVal;
	}
}

/* public int maxPathSum(TreeNode root) {
if (root == null) return 0;
ans = root.val;
getMax(root);
return ans;
}

private int getMax(TreeNode node) {
if (node == null) return 0;

int left = getMax(node.left);
int right = getMax(node.right);

int maxPathThruCurrent; //max path with current node as root 
int toReturn; //max between node.val, node.val + left, node.val + right

if (left <= 0 && right <= 0){
    maxPathThruCurrent = node.val;
    toReturn = node.val;
}
else if (left <= 0) {
    maxPathThruCurrent = node.val + right;
    toReturn = node.val + right;
}
else if (right <= 0) {
    maxPathThruCurrent = node.val + left;
    toReturn = node.val + left;
}
else {
    maxPathThruCurrent = node.val + left + right;
    toReturn = node.val + Math.max(left, right);
}

ans = Math.max(ans, maxPathThruCurrent);
return toReturn;      
}*/