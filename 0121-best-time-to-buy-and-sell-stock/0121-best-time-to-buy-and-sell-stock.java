class Solution {
    public int maxProfit(int[] prices) {
        int minBuy = prices[0];
        int maxProfit = 0;
        int cost = 0;
        //My sln
        //  for(var i=1;i<prices.length;i++){
        //     if(prices[i]<=min){
        //         min = prices[i];
        //     }
        //     //so price is greater than min, so we can sell. check the max profit
        //     if(prices[i]-min > max){
        //         max = prices[i]-min;
        //     }
        // }


        //DP (diff version of same answer)
        for(var i=1;i<prices.length;i++){
            cost = prices[i] - minBuy;
            maxProfit = Math.max(maxProfit, cost);
            minBuy = Math.min(minBuy,prices[i]);
        }
        return maxProfit;
    }
}