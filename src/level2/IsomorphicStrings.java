package level2;

import java.util.HashMap;

public class IsomorphicStrings {
	public static boolean isIsomorphic(String input1, String input2) {
	    HashMap<Character, Integer> map1 = new HashMap<>();
	    HashMap<Character, Integer> map2 = new HashMap <>();
	    if(input1.length() != input2.length()) return false;
	    for(int i=0; i<input1.length(); i++){
	        char ch=input1.charAt(i);
	        if(map1.containsKey(ch)) map1.put(ch, map1.get(ch)+1);
	        else map1.put(ch, 1);
	        char ch1=input2.charAt(i);
	        if(map2.containsKey(ch1)) map2.put(ch1, map2.get(ch1)+1);
	        else map2.put(ch1, 1);
	    }
	    return map1.values().containsAll(map2.values()) && map2.values().containsAll(map1.values());
	}
}
