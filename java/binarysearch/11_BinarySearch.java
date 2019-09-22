public class 11_BinarySearch {
    public int binary(int[] nums, int target) {
        //二分查找升序数组中是否包含target，包含返回下标，不包含返回-1。
        int i = 0, j = nums.length - 1;
        while(i <= j) {
            int mid = i + (j - i) / 2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] < target) i = mid + 1;
            else j = mid - 1;
        }
        return -1;
    }
}
