package level2;

import java.util.HashMap;
import java.util.Map.Entry;

public class StringCompression {
	public static String compressString(String text) {
	    HashMap<Character, Integer> map = new HashMap<>();
	    String s="";
	    for(int i =0;i<text.length();i++){
	        char ch = text.charAt(i);
	        if (map.containsKey(ch)) {
	            map.put(ch, map.get(ch)+1);
	        }
	        else map.put(ch, 1);
	    }
	        for(Entry<Character, Integer> entry: map.entrySet()) {
	            s=s+entry.getKey();
	            if (entry.getValue() > 1) s+=entry.getValue();
	        }
	    return s;
	}
}
