public class 02_RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        //删除排序数组中的重复值，返回更新后的数组长度
        int slow = 0, fast = 1;
        while(fast < nums.length) {
            if(nums[slow] == nums[fast]) {
                fast++;
            } else {
                nums[++slow] = nums[fast++];
            }
        }
        return  slow + 1;
    }
}
