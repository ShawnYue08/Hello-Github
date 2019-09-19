public class HouseRobber {
    public int houseRoober(int[] nums) {
        //打家劫舍maxSum[i]=Math.max(maxSum[i-1], maxSum[i-2]+curr)
        //maxSum[i]代表当小偷顺序偷到这家时，在不触碰报警装置的前提下所能偷得的最大金额
        if(nums == null) {return 0;}
        else if(nums.length == 1) {return nums[0];}
        int[] maxSum = new int[nums.length];
        maxSum[0] = nums[0];
        maxSum[1] = Math.max(nums[0], nums[1]);
        for(int i = 2; i < nums.length; i++) {
            maxSum[i] = Math.max(maxSum[i-1], maxSum[i-2] + nums[i]);
        }
        return maxSum[maxSum.length-1];
    }
}
