
public class BestTimeToBuySellStock {
	 public int maxProfit(int[] prices) {
	        if(prices.length == 0){
	            return 0;
	        }
	        
	        int[] dp = new int[prices.length];
	        int minPrevPrice = prices[0];
	        int maxProfit = 0;
	        
	        dp[0] = 0;
	        
	        for(int i = 1; i < prices.length; i++){
	            
	            if( (prices[i] - minPrevPrice) > dp[i - 1]){
	                dp[i] = prices[i] - minPrevPrice;
	            }
	            else{
	                dp[i] = dp[i - 1];
	            }
	            
	            if(prices[i] < minPrevPrice){
	                minPrevPrice = prices[i];
	            }
	            
	            if(dp[i] > maxProfit ){
	                maxProfit = dp[i];
	            }
	        }
	        
	        return maxProfit;
	        
	    }

}
