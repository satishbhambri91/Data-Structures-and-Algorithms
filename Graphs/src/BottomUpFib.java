import java.util.Arrays;

public class BottomUpFib {
	
	public static int fib_bottom_up(int n)
	{
		if (n == 1 || n == 2){
			return 1;
		}
		
		int[] btmUp = new int[n+1];
		btmUp[1] = 1;
		btmUp[2] = 1;
		
		for(int i = 3; i <= n; i++){
			btmUp[i] = btmUp[i - 1] + btmUp[i - 2];
		}
		
		return btmUp[n];
		
	}
	
	public static int call_fib_memo(int n){
		int[] memo = new int[n + 1];
		Arrays.fill(memo, -1);
		
		return fib_memo(n, memo);
	}
	
	public static int fib_memo(int n, int[] memo){
		
		int result;
		if(memo[n] != -1){
			return memo[n];
		}
		
		if (n == 1 || n == 2){
			result = 1;
		}
		else{
			result = fib_memo(n - 1, memo) + fib_memo(n - 2, memo);
		}
		
		return result;
	}
	
	public static void main(String[] args){
		
		int n = fib_bottom_up(10);
		
		int y = call_fib_memo(10);
		
		System.out.println("The fibonacci numer generated by bottom up approach is " +n);
		System.out.println("The fibonacci numer generated by memoize approach is " +y);
	}

}
