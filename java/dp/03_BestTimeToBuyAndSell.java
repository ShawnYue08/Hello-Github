public class 03_BestTimeToBuyAndSell {
    public int maxProfit(int[] prices) {
        //第i天的收益=第i天的价格-前i天的最小价格minPrice
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int price : prices) {
            if(price < minPrice) {
                minPrice = price; 
                //minPrice记录最小价格
            } else if(price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }
        return maxProfit;
    }
}
