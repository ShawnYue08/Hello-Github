public class 05_MinCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
        //最小花费爬楼梯f(i) = min(f(i-1),f(i-2)) + cost[i],return min(f(n-1),f(n-2))
        if(cost == null) { return 0; }
        int[] dp = new int[cost.length];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for(int i = 2; i < cost.length; i++) {
            dp[i] = Math.min(dp[i-1], dp[i-2]) + cost[i];
            //一次可以爬一阶或两阶
        }
        return Math.min(dp[dp.length-1], dp[dp.length-2]);
    }
}
