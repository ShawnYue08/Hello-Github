public class 06_MaximumSubarray {
    public int maxSubarray(int[] nums) {
        //f[i]代表以i结尾的子段的最大子序和，
        int res = Integer.MIN_VALUE;
        int last = 0;
        //last变量代表f[i-1]
        for(int i = 0; i < nums.length; i++) {
            int now = Math.max(last, 0) + nums[i];
            //f[i] = max(f[i-1], 0) + nums[i]，
            res = Math.max(res, now);
            //res = max(f[0], f[1], f[2], ... f[n-1])
            last = now;
        }
        return res;
    }
}
