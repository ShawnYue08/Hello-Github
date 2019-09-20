public class 02_RemoveDuplicatesFromSortedArray {
    public void removeDuplicate(int[] nums) {
        //删除排序数组中的重复元素，双指针，快慢指针类型，一个在前探路，一个在后记录有效元素
        int i = 0, j = 1;
        while(j < nums.length) {
            if(nums[i] == nums[j]) {
                j++;
            } else {
                nums[++i] = nums[j++];
            }
        }
        return i + 1;
    }
}
