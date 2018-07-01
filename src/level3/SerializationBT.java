package level3;

import java.util.*;

public class SerializationBT {
	public String serializeTree(TreeNode root) {
		if (root == null)
			return "*,";
		return String.valueOf(root.data) + "," + serializeTree(root.left) + serializeTree(root.right);
	}

	public TreeNode restoreTree(String str) {
		return helper(new LinkedList<String>(Arrays.asList(str.split(","))));
	}

	public TreeNode helper(List<String> list) {
		String s = list.remove(0);
		if (s.equals("*"))
			return null;
		return new TreeNode(Integer.valueOf(s), helper(list), helper(list));
	}
}
