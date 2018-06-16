package level2;

public class PowerOfTwo {
	public static boolean isPowOfTwo(int num) {
	    if(( num & (num-1)) == 0) return true; // & has higher precedence than == 
	    return false;
	}
}
