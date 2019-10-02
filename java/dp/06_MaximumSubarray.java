public class 06_MaximumSubarray {
    public int maxSubarray(int[] nums) {
        //f[i]代表以i结尾的子段，就是子序必须包含nums[i]，当然了，以i结尾的子序，最大和不一定就要包含nums[i]，所以res = max(res, now)。
        int res = Integer.MIN_VALUE;
        int last = 0;
        for(int i = 0; i < nums.length; i++) {
            int now = Math.max(last, 0) + nums[i];
            res = Math.max(res, now);
            last = now;
        }
        return res;
    }
}
