package level3;

import java.util.*;

public class AncestorsOfNodeBT {
	public ArrayList<Integer> ancestorsList = new ArrayList<Integer>();

	public boolean printAncestors(TreeNode root, int nodeData) {
		if (root == null)
			return false;
		if (root.data == nodeData)
			return true;
		if (printAncestors(root.left, nodeData) || printAncestors(root.right, nodeData)) {
			ancestorsList.add(root.data);
			return true;
		}
		return false;
	}
}
