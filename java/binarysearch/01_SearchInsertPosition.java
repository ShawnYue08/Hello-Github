public class 01_SearchInsertPosition {
    public int searchPosition(int[] nums, int target) {
        //搜索插入位置，搜索大于等于target的最左元素的下标，搜索的是右区间的最左边界，使用二分查找的模板1
        
        //假如排序数组的最大元素小于target,那么插入nums.length位置。
        if(nums[nums.length-1] < target) {
            return nums.length;
        }
        int i = 0, j = nums.length - 1;
        while(i < j) {
            int mid = i + j >> 1;
            if(nums[mid] >= target) {
                //如果mid满足右侧性质
                j = mid;
            } else {
                //如果mid满足左侧性质
                i = mid + 1;
            }
        }
        return i;
    }
}
