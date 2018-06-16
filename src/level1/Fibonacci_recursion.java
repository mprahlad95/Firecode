package level1;

public class Fibonacci_recursion {
	public static int fib(int n) {
	    if(n<=1) return n;
	    System.out.println(fib(n-1) + fib(n-2));
	    int i = fib(n-1) + fib(n-2);
	    System.out.println(i);
	    return i;
	}
	public static void main(String[] args) {
		int n = 6;
		fib(n);
	}
}
