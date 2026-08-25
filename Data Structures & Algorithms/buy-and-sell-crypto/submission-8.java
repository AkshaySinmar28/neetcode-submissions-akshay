class Solution {
    public int maxProfit(int[] prices) {
        int minBuy = prices[0];
        int maxProfit = 0;
        for(int i=0; i<prices.length; i++){
            minBuy = Math.min(prices[i],minBuy);
            maxProfit = Math.max(maxProfit,prices[i] - minBuy);
        }
        return maxProfit;
    }
}
