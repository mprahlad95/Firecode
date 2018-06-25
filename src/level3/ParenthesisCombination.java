package level3;

import java.util.ArrayList;

public class ParenthesisCombination {
	public static ArrayList<String> combParenthesis(int pairs) {  
        ArrayList<String> res = new ArrayList<String>();
        if (pairs > 0) {
            combParenthesis(pairs,pairs,"",res);
        }
        return res;
    }

    public static void combParenthesis(int left, int right, String tmp, ArrayList<String> res) {
        if (left == 0 && right == 0) {
            res.add(tmp);
        } 
        else {
            if (left > 0) {
                combParenthesis(left-1,right,tmp+"(", res);
            }
            if (right > left) {
                combParenthesis(left,right-1,tmp+")", res);
            }
        }
        return;
    }
    public static void main(String[] args) {
    	ArrayList<String> arr = new ArrayList<>();
    	arr = combParenthesis(5);
//    	System.out.println(arr);
    }
}
