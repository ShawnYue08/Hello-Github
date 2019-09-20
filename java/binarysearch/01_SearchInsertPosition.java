public class 01_SearchInsertPosition {
    public int searchPosition(int[] nums, int target) {
        //搜索插入位置，搜索大于等于target的最小下标进行插入，搜索的是右区间的最左边界，使用二分查找的模板1
        if(nums[nums.length-1] < target) {
            return nums.length;
        }
        int i = 0, j = nums.length - 1;
        while(i < j) {
            int mid = i + j >> 1;
            if(nums[mid] >= target) {
                //当mid满足右侧性质时
                j = mid;
            } else {
                //当mid满足左侧性质时
                i = mid + 1;
            }
        }
        return i;
    }
}
