public class 11_LongestIncreaseSubsence {
    public int lengthOfLIS(int[] nums) {
        //f[i]：以i结尾的上升子序列，属性：长度的最大值
        //res：枚举f数组的所有值，取最大值
        int n = nums.length;
        int[] f = new int[n];
        for(int i = 0; i < n; i++) {
            f[i] = 1;
            //最大上升子序列长度为1
            for(int j = 0; j < i; j++) {
                if(nums[j] < nums[i]) 
                    f[i] = Math.max(f[i], f[j] + 1);
                    //不要管f[j]，因为在i上升的过程中，f[j]已经计算好了
            }
        }
        int res = 0;
        for(int k = 0; k < n; k++) 
            res = Math.max(res, f[k]);
        return res;
    }
}
