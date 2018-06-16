package level1;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class RemoveDuplicatesFromArrayList {
	public static ArrayList<String> removeDuplicates(List<String> input) {
	    Set<String> s = new LinkedHashSet<>(input);
	    ArrayList<String> s1 = new ArrayList<>(s);
	    Collections.sort(s1);
	    return s1;
	}
}
