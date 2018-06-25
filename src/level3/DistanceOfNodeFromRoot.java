package level3;

public class DistanceOfNodeFromRoot {
	public int pathLengthFromRoot(TreeNode root, int n1) {
		if (root == null)
			return 0;
		int distance = 0;
		if ((root.data == n1) || (distance = pathLengthFromRoot(root.left, n1)) > 0
				|| (distance = pathLengthFromRoot(root.right, n1)) > 0)
			return distance + 1;
		return 0;
	}
}
