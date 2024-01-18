
public class ClimbingStairs {
	
	
	 public static int climbStairs(int n) {

	        int a = 0, b = 1, c, i;
	        if (n <= 3 )
	            return n;
	        for (i = 2; i <= n+1; i++) {
	            c = a + b;
	            a = b;
	            b = c;
	        }
	        return b;
	    }

}
