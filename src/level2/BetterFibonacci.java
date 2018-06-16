package level2;

public class BetterFibonacci {
	public static int betterFibonacci(int n) {
	    int n1 = 0;
	    int n2 = 1;
	    int sum = n1+n2;
	    if(n==n1 || n == n2) return n;
	    for(int i = 2; i <= n; i++){
	        sum = n1 + n2;
	        n1 = n2;
	        n2 = sum;
	    }
	    return sum;
	}
}
