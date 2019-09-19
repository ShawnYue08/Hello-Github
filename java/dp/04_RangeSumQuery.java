/*
sumRange()实现数组nums[i,j]的数之和，动态规划，数组sums[i]记录nums前i个数之和
*/
class NumArray {
    int[] sums;
    
    public NumArray(int nums) {
        sums = new int[nums.length+1];
        for(int i = 0; i < nums.length; i++) {
            sums[i+1] = sums[i] + nums[i]; 
            //sums[1] = nums[0], sums[2] = nums[0] + nums[1], 依次类推
        }
    }
    
    public int sumRange(int i, int j) {
        return sums[j+1] - sums[i];
    }
}
