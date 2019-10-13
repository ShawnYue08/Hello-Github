public class HouseRobber {
    //一个状态数组maxSum[i]
    public int houseRoober(int[] nums) {
        //maxSum[i]代表所能偷得的最大金额
        if(nums == null || nums.length == 0) return 0;
        else if(nums.length == 1) return nums[0];
        int[] maxSum = new int[nums.length];
        maxSum[0] = nums[0];
        maxSum[1] = Math.max(nums[0], nums[1]);
        for(int i = 2; i < nums.length; i++) {
            maxSum[i] = Math.max(maxSum[i-1], maxSum[i-2] + nums[i]);
        }
        return maxSum[maxSum.length-1];
    }
    //两个状态数组f[i],g[i]
    public int houseRoober(int[] nums) {
        //f[i]代表所有没有选择nums[i]的最大值，f[i] = max(f[i-1], g[i-1])，g[i]代表所有选择nums[i]的最大值，g[i] = nums[i] + f[i-1]
        //return max(f[nums.length-1], g[nums.length-1])
        int n = nums.length;
        int[] f = new int[n], g = new int[n];
        f[0] = 0;
        g[0] = nums[0];
        for(int i = 1; i < n; i++) {
            f[i] = Math.max(f[i-1], g[i-1]);
            g[i] = f[i-1] + nums[i];
        }
        return Math.max(f[n-1], g[n-1]);
    }
}
