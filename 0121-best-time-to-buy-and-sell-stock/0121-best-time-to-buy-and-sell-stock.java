class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int maxProfit = 0;
        for(var price : prices){
            if(price < min){
                min = price;
            }
            if(price - min > maxProfit){
                maxProfit = price - min;
            }
        }
        return maxProfit;
    }
}