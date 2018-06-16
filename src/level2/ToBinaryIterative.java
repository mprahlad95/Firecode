package level2;

public class ToBinaryIterative {
	public static String computeBinary(int val) {
	    int len = String.valueOf(val).length();
	    if(val < 2) return Integer.toString(val);
	    String ans="";
	    while(val >= 2){
	        ans += String.valueOf(val % 2);
	        System.out.println(ans);
	        val = val/2;
	    }
	    ans += String.valueOf(val);    
	    String ans1="";
	    for(int i=ans.length()-1;i>=0;i--){
	        ans1=ans1+ans.charAt(i);
	    }
	    return ans1;
	}
}
