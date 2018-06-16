package level1;

import java.util.TreeSet;

public class UniqueCharacters {
	public static boolean areAllCharactersUnique(String str){
	    TreeSet tree = new TreeSet();
	    Boolean flag = true;
	    if(str == null) return true;
	    for(int i=0;i<str.length();i++){
	        if(tree.contains(str.charAt(i))) flag = false;
	        else tree.add(str.charAt(i));
	        }
	        return flag;
	}
}
