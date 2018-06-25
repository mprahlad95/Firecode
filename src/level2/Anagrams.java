package level2;

import java.util.HashMap;
import java.util.Map;

public class Anagrams {
	public static boolean isAnagram(String input1, String input2) {
	    if(input1 == null || input2 == null) return false;
	    if(input1.length() != input2.length()) return false;
	    HashMap<Character, Integer> map = new HashMap<>();
	    HashMap<Character, Integer> map1 = new HashMap<>();
	    for(int i=0;i<input1.length();i++){
	        if (map.containsKey(input1.charAt(i))) map.put(input1.charAt(i), map.get(input1.charAt(i)) +1);
	        else map.put(input1.charAt(i), 1);
	        if (map1.containsKey(input2.charAt(i))) map1.put(input2.charAt(i), map1.get(input2.charAt(i)) +1);
	        else map1.put(input2.charAt(i), 1);
	    }
	    for(Map.Entry<Character, Integer> entry:map.entrySet())
	        if(!(entry.getValue().equals(map1.get(entry.getKey())))) return false;
	        return true;
	}
}
