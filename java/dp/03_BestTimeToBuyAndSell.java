public class 03_BestTimeToBuyAndSell {
    public int maxProfit(int[] prices) {
        if(prices.length == 0) return 0;
        int minPrice = prices[0];
        int maxProfit = 0;
        for(int i = 0; i < prices.length; i++) {
            maxProfit = Math.max(maxProfit, prices[i] - minPrice); 
            //最大收益需要和前i次的最小价格比较,然后才可以更新MinPrice
            minPrice = Math.min(minPrice, prices[i]);            
        }
        return maxProfit;
    }
}
