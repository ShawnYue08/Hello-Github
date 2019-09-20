public class 04_SearchInsertPosition {
    public int searchInsertPosition(int[] nums, int target) {
        //在排序数组中找到插入该元素的合适位置，搜索大于等于target的最左下标，二分模板1
        if(nums[nums.length-1] < target) { return nums.length; ]
        int left = 0, right = nums.length-1;
        while(left < right) {
            int mid = left + right >> 1;
            if(nums[mid] >= target) {
                //当mid满足右侧区间性质时
                right = mid;
            } else {
                //当mid满足左侧区间性质时
                left = mid + 1;
            }
        }
        return left;
        /*
        右侧区间性质：nums[i] >= target
        左侧区间性质：nums[i] < target
        搜索的是右侧区间的最左元素，所以采用模板1.
        */
    }
}
