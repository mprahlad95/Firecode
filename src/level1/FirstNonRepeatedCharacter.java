package level1;

import java.util.HashMap;
import java.util.Map.Entry;

public class FirstNonRepeatedCharacter {
	public static Character firstNonRepeatedCharacter(String str) {
	    HashMap<Character, Integer> map = new HashMap<>();
	    char ch;
	    for(int i=0;i<str.length(); i++){
	        ch = str.charAt(i);
	        	if (map.containsKey(ch))
					map.put(ch, map.get(ch) + 1);
				else
					map.put(ch, 1);
			}
			char res=' ';
			int flag = 0;
			for (Entry<Character, Integer> entry : map.entrySet()) {
				if (entry.getValue() == 1) {
					res = entry.getKey();
					flag = 1;
					break;
				}
			}
			if (flag == 0) return null;
	      return res;  
	}
}
